package com.hw1.model.vo;

public class Person {
	protected String name;
	
	/*
	 * private 필드는 상속을 통해 자식 클래스가
	 * 부모클래스의 필드를 물려받더라도
	 * getter/setter를 이용하여 간접 접근 해야함
	 * 
	 * 
	 * 
	 * */
	
	private int age;
	private double height;
	private double weight;
	
	public Person() {}

	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String information() {
		String str;
		
		str = "이름 : " + name;
		str += " / 나이 : " + age;
		str += " / 신장 : " + height;
		str += " / 몸무게 : " + weight;
		
		return str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
