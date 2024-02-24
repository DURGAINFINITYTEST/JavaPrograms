package com.interview;

import java.util.Arrays;

public class JavaPrograms {

	public static void main(String[] args) {
		
		
		
		
		
		

		String name = "durga prasad katakatla";

		name = name.toLowerCase();

		int vowelCount = 0;

		for (int i = 0; i < name.length(); i++) {

			char currentChar = name.charAt(i);

			if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'
					|| currentChar == 'u') {

				vowelCount++;

				System.out.println(currentChar + " ");

			}

		}
		System.out.println(vowelCount);
		
		

		boolean status = name.toLowerCase().matches(".*[aeiou].*");
		System.out.println(status);

		int myNum = 7;

		int count = 0;

		for (int i = 1; i <= myNum; i++) {

			if (myNum % i == 0) {
				count++;
			}
		}

		System.out.println(count);
		if (count == 2) {
			System.out.println("this is a prime number");
		} else {
			System.out.println("this is not a  prime number");
		}

		int n1 = 0;
		int n2 = 1;

		System.out.print(n1 + " " + n2);

		for (int i = 0; i <= 10; i++) {

			int next = n1 + n2;
			System.out.print(" " + next);

			n1 = n2;
			n2 = next;

		}

		String n = "amma";

		String rev = "";

		for (int i = 0; i < n.length(); i++) {
			rev = n.charAt(i) + rev;
		}

		if (n.equals(rev)) {
			System.out.println("this is a palindrom String");
		} else {
			System.out.println("this is not a palindrom String");
		}

		String na = "mani babu k";
		na.replace(" ", "");
		System.out.println(na);

		int[] array = { 1, 2, 3, -1, -2, 4 };

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));

		int number = 4;
		int facto = 1;

		for (int a = 1; a <= number; a++) {

			facto = facto * a;
		}

		System.out.println(facto);
	}

}
