package com.hcl.collection_exercise_three;

import java.util.ArrayList;
import java.util.Collections;

/*3.	Write a Java program to reverse elements in a array list.*/
public class ExerciseThree {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		ArrayList<String> temp = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Pink");
		Collections.reverse(colors);
		System.out.println(colors);
	}
}
