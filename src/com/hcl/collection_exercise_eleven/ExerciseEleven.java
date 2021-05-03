package com.hcl.collection_exercise_eleven;

import java.util.*;

public class ExerciseEleven {
	public static void main(String[] args) {
		// Create a default calendar
		Calendar cal = Calendar.getInstance();
		// Get and display information of current date from the calendar:
		System.out.println();
		System.out.println("Year: " + cal.get(Calendar.YEAR));
		System.out.println("Month: " + cal.get(Calendar.MONTH));
		System.out.println("Day: " + cal.get(Calendar.DATE));
		System.out.println("Hour: " + cal.get(Calendar.HOUR));
		System.out.println("Minute: " + cal.get(Calendar.MINUTE));
		System.out.println();
	}
}
