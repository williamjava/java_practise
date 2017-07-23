package com.gui.practise.design_model.principles.ocp;

public class ComputerBook implements IComputerBook {
	private String name;
	private String author;
	private int price;
	private String scope;

	public ComputerBook(String name, String author, int price, String scope) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.scope = scope;
	}

	public String getName() {
		return this.name;
	}

	public String getAuthor() {
		return this.author;
	}

	public int getPrice() {
		return this.price;
	}

	public String getScope() {
		return this.scope;
	}

}
