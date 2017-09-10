package com.homework.lambda;

import java.util.ArrayList;

public class SuperHeroes {

	public ArrayList<String> superHeroes = new ArrayList<String>();

	public SuperHeroes() {

	}

	public ArrayList<String> MethodReferencesHW() {

		superHeroes.add("The Flash");
		superHeroes.add("Superman");
		superHeroes.add("Spider-man");
		superHeroes.add("Wonder Woman");
		superHeroes.add("Daredevil");

		return superHeroes;
	}
}
