 //Program to demonstrate encapsulation
package com.tnsif.encapsulation;

public class Encapsulation {
	// if no access specifier is mentioned then it will be default
	private int serialNum=10;//Data variable
	private String name;
	private int age;
	// by using getter and setter private data members can be accessed
	
	
	

//to display sting representation of the object
	@Override
	public String toString() {
		return "Encapsulation [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}

	

	public int getSerialNum() {
		return serialNum;
	}



	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
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
	
}
