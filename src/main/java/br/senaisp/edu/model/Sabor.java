package br.senaisp.edu.model;

public class Sabor {
	private String name;
	private String desc;
	private Double price;
	
	public Sabor() {
		
	}

	public Sabor(String name, String desc, Double price) {
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return 
				"</br> Sabor  name = " 
				+ name 
				+ ", </br> description = " 
				+ desc 
				+ ", </br> price = R$ " 
				+ price;
	}
	
	
	
	
}
