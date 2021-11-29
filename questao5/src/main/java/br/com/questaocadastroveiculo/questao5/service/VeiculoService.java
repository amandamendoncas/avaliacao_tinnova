package br.com.questaocadastroveiculo.questao5.service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import br.com.questaocadastroveiculo.questao5.enums.MarcaEnum;
import br.com.questaocadastroveiculo.questao5.exception.IdException;
import br.com.questaocadastroveiculo.questao5.model.VeiculoEntity;
import br.com.questaocadastroveiculo.questao5.model.VeiculoPesquisaInterface;
import br.com.questaocadastroveiculo.questao5.repository.VeiculoRepository;
import br.com.questaocadastroveiculo.questao5.util.DateUtil;

@Service
public class VeiculoService {
	@Autowired
	private VeiculoRepository repository;

	// funcao que salva um determinado veiculo
	public VeiculoEntity salvar(VeiculoEntity veiculo) throws IllegalArgumentException {
		try {
			MarcaEnum.fromString(veiculo.getMarca());
			return repository.save(veiculo);

		} catch (Exception e) {
			System.err.println(e);
		}
		return null;

	}

	/// funcao que atualiza os dados do veiculo
	public VeiculoEntity atualizar(VeiculoEntity veiculo, Long id) throws IdException {
		Optional<VeiculoEntity> result = repository.findById(id);
		if (result.isPresent()) {
			VeiculoEntity veiculoAtual = result.get();
			veiculoAtual.setAno(veiculo.getAno());
			veiculoAtual.setDescricao(veiculo.getDescricao());
			veiculoAtual.setMarca(veiculo.getMarca());
			veiculoAtual.setVeiculo(veiculo.getVeiculo());
			veiculoAtual.setVendido(veiculo.isVendido());
			return repository.save(veiculoAtual);
		} else {
			throw new IdException("Não foi encontrado resultado para a pesquisa");
		}
	}

	/// funcao que atualiza um determinado dado de um veiculo
	public VeiculoEntity atualizarVeiculo(@RequestBody Map<String, Object> fields, @PathVariable Long id) {
		try {
			VeiculoEntity veiculo = this.buscar(id);
			fields.forEach((k, v) -> {
				Field field = ReflectionUtils.findField(VeiculoEntity.class, k);
				field.setAccessible(true);
				ReflectionUtils.setField(field, veiculo, v);
			});
			return veiculo;
		} catch (Exception e) {
			// mensagem de erro
		}
		return null;

	}

	/// funcao que deleta um determinado veiculo
	public void deletar(Long id) {
		repository.deleteById(id);
	}

	/// funcao retorna um determinado veiculo de acordo com o id
	public VeiculoEntity buscar(Long id) throws IdException {
		Optional<VeiculoEntity> veiculo = repository.findById(id);
		if (veiculo.isPresent()) {
			return veiculo.get();
		} else {
			throw new IdException("Não foi encontrado resultado para a pesquisa");
		}
	}

	/// funcao retorna todos os veiculos
	public Iterable<VeiculoEntity> buscar() {
		return repository.findAll();
	}

	// funcao que busca os veiculos que nao foram vendidos
	public List<VeiculoPesquisaInterface> vericaVeiculosNaoVendidos() {
		return repository.verificaVeiculosNaoVendidos();
	}

	// funcao que busca os veiculos de acordo com a marca
	public List<VeiculoPesquisaInterface> buscaVeiculosMarca() {
		return repository.buscaVeiculosMarca();
	}

	// funcao que busca os veiculos adicionados da ultima semana
	public List<VeiculoPesquisaInterface> buscaVeiculosUltimaSemana() {
		return repository.buscaVeiculosUltimaSemana(DateUtil.buscaUltimoDomingo(), DateUtil.buscaUltimoSabado());

	}

	// funcao que busca os veiculos por decada
	public List<VeiculoPesquisaInterface> buscaVeiculosDecada() {
		return repository.buscaVeiculosDecada();
	}

}
