package com.homework.stream;

public class Person {

	String name;
	int iq;

	public Person() {
	}

	public Person(String name, int iq) {

		this.name = name;
		this.iq = iq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", iq=" + iq + "]";
	}

}
