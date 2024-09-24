package com.hw4.model.dto;

public class Book {
	private String bookNum;
	private String bookName;
	private String author;
	private int price;
	private String publish;
	
	public Book() {}

	public Book(String bookNum, String bookName, String author, int price, String publish) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.publish = publish;
	}

	public String getBookNum() {
		return bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}
	
	
}
