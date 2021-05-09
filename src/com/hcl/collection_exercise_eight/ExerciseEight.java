package com.hcl.collection_exercise_eight;

//8.	Write a Java program to sort keys in Tree Map by using comparator
import java.util.*;
import java.util.Map.Entry;

public class ExerciseEight {
	public static void main(String args[]) {
		TreeMap<String, String> tree_map1 = new TreeMap<String, String>(new KeySort());
		// Put elements to the map
		tree_map1.put("C2", "Red");
		tree_map1.put("C4", "Green");
		tree_map1.put("C3", "Black");
		tree_map1.put("C1", "White");
		System.out.println(tree_map1);
	}
}

class KeySort implements Comparator<String> {
	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2);
	}
}
