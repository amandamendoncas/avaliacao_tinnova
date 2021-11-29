package br.com.questaocadastroveiculo.questao5.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.questaocadastroveiculo.questao5.model.VeiculoEntity;
import br.com.questaocadastroveiculo.questao5.model.VeiculoPesquisaInterface;

public interface VeiculoRepository extends CrudRepository<VeiculoEntity, Long> {

	//query que busca os veiculos que nao foram vendidos
	@Query(value = "select id, veiculo, marca, ano, descricao, vendido, created, update from veiculo_entity where vendido = false", nativeQuery = true)
	List<VeiculoPesquisaInterface> verificaVeiculosNaoVendidos();

	//query que busca a quantidade de veiculos de acordo com a marca
	@Query(value = "select marca as marca,count(*) as quantidade from veiculo_entity group by marca", nativeQuery = true)
	List<VeiculoPesquisaInterface> buscaVeiculosMarca();
	
	//query que busca os veiculos adicionados na ultima semana
	@Query(value = "select id, veiculo, marca, ano, descricao, vendido, created, update from veiculo_entity where created between ?1 and ?2", nativeQuery = true)
	List<VeiculoPesquisaInterface> buscaVeiculosUltimaSemana(Date domingo,Date sabado);
	
	//query que busca a quantidade de veiculos agrupando pela decada
	@Query(value = "select s_query.d as anoDecada,count(*) as quantidade  from (select (ano - mod(ano, 10)) as d FROM veiculo_entity) as s_query group by s_query.d", nativeQuery = true)
	List<VeiculoPesquisaInterface> buscaVeiculosDecada();

}
