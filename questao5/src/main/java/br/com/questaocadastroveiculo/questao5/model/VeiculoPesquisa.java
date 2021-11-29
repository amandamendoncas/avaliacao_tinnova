package br.com.questaocadastroveiculo.questao5.model;

import java.util.Date;



public class VeiculoPesquisa implements VeiculoPesquisaInterface {
	private Long id;
	private String veiculo;
	private String marca;
	private Integer ano;
	private String descricao;
	private Boolean vendido;
	private Date created;
	private Date update;
	private Integer quantidade;
	private Integer anoDecada;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	public Boolean getVendido() {
		return vendido;
	}
	public void setVendido(Boolean vendido) {
		this.vendido = vendido;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Integer getAnoDecada() {
		return anoDecada;
	}
	public void setAnoDecada(Integer anoDecada) {
		this.anoDecada = anoDecada;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdate() {
		return update;
	}
	public void setUpdate(Date update) {
		this.update = update;
	}
	
	
	
}
