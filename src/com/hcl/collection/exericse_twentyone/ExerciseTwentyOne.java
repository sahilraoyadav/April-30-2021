package com.hcl.collection.exericse_twentyone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExerciseTwentyOne {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		String dateI = scanner.nextLine();
		Date date = new Date(dateI);
		SimpleDateFormat tempFormat = new SimpleDateFormat("MM-dd-yyyy");
		String dateT = tempFormat.format(date);
		System.out.println(dateT);
	}
}
