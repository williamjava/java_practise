package com.gui.practise.design_model.principles.ocp;

public class NovelBook implements IBook {
	private String name;
	private String author;
	private int price;

	public NovelBook(String name, String author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
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

}
