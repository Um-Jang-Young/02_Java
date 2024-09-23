package com.hw3.model.dto;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Toy {
	private String toyName;
	private int age;
	private int price;
	private String color;
	private String madeDay;
	private Set<String> material;
	
	public Toy() {}

	public Toy(String toyName, int age, int price, String color, String madeDay, Set<String> material) {
		super();
		this.toyName = toyName;
		this.age = age;
		this.price = price;
		this.color = color;
		this.madeDay = madeDay;
		
		this.material = new HashSet<String>();
		for(String m : material) {
			this.material.add(m);
		}
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

	public Set<String> getMaterial() {
		return material;
	}

	public void setMaterial(Set<String> material) {
		this.material = material;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, madeDay, material, price, toyName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(madeDay, other.madeDay)
				&& Objects.equals(material, other.material) && price == other.price
				&& Objects.equals(toyName, other.toyName);
	}
	
	
	
	
}
