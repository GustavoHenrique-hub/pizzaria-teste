package br.senaisp.edu.model;

public class Cliente {
	private Integer id;
	private String nome;
	private String tel;
	private String rua;
	private Integer numero;
	private String bairro;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String tel, String rua, Integer numero, String bairro) {
		this.nome = nome;
		this.tel = tel;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "<br> nome = " 
				+ nome 
				+ ", <br> tel = " 
				+ tel 
				+ ", <br> rua = " 
				+ rua 
				+ ", <br> numero = " 
				+ numero 
				+ ", <br> bairro = " 
				+ bairro;
	}
	
	
	
}
