package com.hcl.collection_exercise_one;

/*1.	Write a Java program to create a new array list, add some colors (string) and print out the collection.*/
import java.util.ArrayList;

public class ExerciseOne {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Pink");
		System.out.println(colors);
		for (String color : colors) {
			System.out.println(color);
		}
	}
}
