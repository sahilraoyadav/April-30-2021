package com.hcl.collection_exercise_seventeen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*17.Write a program to read  two String variables in DD-MM-YYYY.Compare the two dates and return the older date in 'MM/DD/YYYY' format. 
Include a class UserMainCode with a static method findOldDate which accepts the string values. The return type is the string. 
Create a Class Main which would be used to accept the two string values and call the static method present in UserMainCode. 
Sample Input 1: 
05-12-1987 
8-11-2010 
Sample Output 1: 
12/05/1987 */

public class ExerciseSeventeen {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat tempF = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = tempF.parse("2020-01-30");
		Date date2 = tempF.parse("2020-01-31");

		System.out.println("date1 : " + tempF.format(date1));
		System.out.println("date2 : " + tempF.format(date2));

		int result = date1.compareTo(date2);
		System.out.println("result: " + result);

		if (result == 0) {
			System.out.println("Date1 is equal to Date2");
		} else if (result > 0) {
			System.out.println("Date1 is after Date2");
		} else if (result < 0) {
			System.out.println("Date1 is before Date2");
		} else {
			System.out.println("How to get here?");
		}

	}
}