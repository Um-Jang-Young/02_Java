package com.hw3.model.dto;

import java.util.HashMap;

public class Toy {
	private String toyName;
	private int age;
	private int price;
	private String color;
	private String madeDay;
	private HashMap<Integer, String> material;
	
	public Toy() {}

	public Toy(String toyName, int age, int price, String color, String madeDay, HashMap<Integer, String> material) {
		super();
		this.toyName = toyName;
		this.age = age;
		this.price = price;
		this.color = color;
		this.madeDay = madeDay;
		this.material = material;
	}

	public String getToyName() {
		return toyName;
	}

	public void setToyNmae(String toyName) {
		this.toyName = toyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMadeDay() {
		return madeDay;
	}

	public void setMadeDay(String madeDay) {
		this.madeDay = madeDay;
	}

	public HashMap<Integer, String> getMaterial() {
		return material;
	}

	public void setMaterial(HashMap<Integer, String> material) {
		this.material = material;
	}
	
	
	
	
}
