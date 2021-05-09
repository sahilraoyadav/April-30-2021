package com.hcl.collection_exercise_fourteen;

import java.util.*;

public class ExerciseFourteen {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		System.out.println(display(year, month));

	}

	public static int display(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		int DAY_OF_MONTH = cal.getActualMaximum(cal.DAY_OF_MONTH);
		return DAY_OF_MONTH;
	}
}
