package com.hcl.collection_exercise_sixteen;

import java.util.*;

public class ExerciseSixteen {

	public static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int temp = Integer.parseInt(sc.nextLine());
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		for (int i = 0; i < temp; i++) {
			String temp1 = sc.nextLine();
			String temp2 = sc.nextLine();
			hm.put(temp1, temp2);
		}
		String tempS = sc.nextLine();
		LinkedHashMap<String, String> tempL = new LinkedHashMap<String, String>();
		tempL = sort(hm, tempS);
		Iterator<String> it = tempL.keySet().iterator();

		while (it.hasNext()) {
			String s2 = it.next();
			System.out.println(s2);
		}
	}

	public static LinkedHashMap<String, String> sort(LinkedHashMap<String, String> h1, String n) {
		int k = 0;
		LinkedHashMap<String, String> hm1 = new LinkedHashMap<String, String>();
		Iterator<String> iterator = h1.keySet().iterator();
		while (iterator.hasNext()) {
			String s2 = iterator.next();
			String s3 = h1.get(s2);
			if (s3.equals(n))
				hm1.put(s2, s3);
		}
		return hm1;
	}

}
