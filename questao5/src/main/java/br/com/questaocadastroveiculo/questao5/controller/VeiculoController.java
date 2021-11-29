package br.com.questaocadastroveiculo.questao5.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.questaocadastroveiculo.questao5.exception.IdException;
import br.com.questaocadastroveiculo.questao5.model.VeiculoEntity;
import br.com.questaocadastroveiculo.questao5.model.VeiculoPesquisaInterface;
import br.com.questaocadastroveiculo.questao5.service.VeiculoService;


@RestController
@RequestMapping("/veiculos")
@CrossOrigin(origins = "http://localhost:3000")
public class VeiculoController {
	@Autowired
	VeiculoService service;

	@PostMapping
	public VeiculoEntity adicionar(@RequestBody VeiculoEntity veiculo) {
		return service.salvar(veiculo);
	}

	@PutMapping("/{id}")
	public VeiculoEntity atualizar(@RequestBody VeiculoEntity veiculo, @PathVariable Long id) {
		try {
			return service.atualizar(veiculo, id);
		} catch (IdException e) {
			e.printStackTrace();
			return null;
		}
	}

	@PatchMapping("/{id}")
	public VeiculoEntity atualizarVeiculo(@RequestBody Map<String, Object> fields, @PathVariable Long id) {
		try {
			return service.atualizarVeiculo(fields, id);
		} catch (Exception e) {
			// mensagem de erro
		}
		return null;

	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		service.deletar(id);
	}

	@GetMapping("/{id}")
	public VeiculoEntity buscar(@PathVariable Long id) {
		try {
			return service.buscar(id);
		} catch (IdException e) {
			e.printStackTrace();
			// responder com mensagem de erro
			return null;
		}
	}

	@GetMapping
	public Iterable<VeiculoEntity> buscar() {
		return service.buscar();
	}

	@GetMapping("/find")
	public List<VeiculoPesquisaInterface> buscarTermo(@RequestParam("q") String query) {
		switch (query) {
		case "vendidos":
			return service.vericaVeiculosNaoVendidos();

		case "fabricante":
			return service.buscaVeiculosMarca();

		case "decada":
			return service.buscaVeiculosDecada();

		case "semana":
			return service.buscaVeiculosUltimaSemana();

		default:
			break;
		}

		return null;

	}

}
