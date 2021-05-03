package com.hcl.collection_exercise_ten;

import java.util.*;
import java.text.*;

public class ExerciseTen {
	public static void main(String[] args) {
		try {
			String originalString = "2021-05-18 09:03:02";
			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(originalString);
			String newstr = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss").format(date);
			System.out.println("\n" + newstr + "\n");
		} catch (ParseException e) {
			// Handle exception here
			e.printStackTrace();
		}
	}
}
