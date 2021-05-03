package com.hcl.collection_exercise_two;
/*2.	Write a Java program to iterate through all elements in a array list*/

import java.util.ArrayList;

public class ExerciseTwo {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Pink");
		for (String color : colors) {
			System.out.println(color);
		}
	}
}
