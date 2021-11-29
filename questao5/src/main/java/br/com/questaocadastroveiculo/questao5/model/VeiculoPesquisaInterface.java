package br.com.questaocadastroveiculo.questao5.model;

import java.util.Date;

public interface VeiculoPesquisaInterface {
	public Long getId();

	public String getVeiculo();

	public String getMarca();

	public Integer getAno();

	public String getDescricao();

	public Boolean getVendido();

	public Integer getQuantidade();

	public Integer getAnoDecada();

	public Date getCreated();

	public Date getUpdate();

}
