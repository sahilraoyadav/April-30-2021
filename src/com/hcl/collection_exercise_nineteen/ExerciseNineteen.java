package com.hcl.collection_exercise_nineteen;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseNineteen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ipAdd = scanner.nextLine();
		if (ipValidator(ipAdd) == 1) {
			System.out.println(ipAdd + " is Valid");
		}
		else {
			System.out.println(ipAdd + " is Invalid");
		}
	}

	static int ipValidator(String ip) {
		String[] ipAddArray = ip.split("\\.");
		for (String element : ipAddArray) {
			if (0 < Integer.parseInt(element) || Integer.parseInt(element) > 255) {
				return 0;
			}
		}
		return 1;
	}

}