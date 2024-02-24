package com.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Occurrences {

	public static void main(String[] args) {

		String sen = "Auto generated method stub";
		String arr[] = sen.toLowerCase().trim().split(" ");

		// Printing the length of the original string
		System.out.println(sen.length());

		Map<String, Integer> list = new HashMap<>();

		// Counting occurrences of each word
		for (String one : arr) {
			if (list.containsKey(one)) {
				list.put(one, list.get(one) + 1);
			} else {
				list.put(one, 1);
			}
		}

		// Printing the occurrences
		for (Map.Entry<String, Integer> entry : list.entrySet()) {
			System.out.println("Word: " + entry.getKey() + ", Occurrences: " + entry.getValue());
		}

		String name = "durga prasad katakatla";

		char[] charList = name.toCharArray();

		Map<Character, Integer> charL = new HashMap<>();

		for (char o : charList) {

			if (charL.containsKey(o)) {

				charL.put(o, charL.get(o) + 1);

			} else {
				charL.put(o, 1);
			}
		}
		System.out.println(charL);

		String revWord = "";

		String[] names = name.split(" ");

		for (String on : names) {

			revWord = on + " " + revWord;

		}
		System.out.println(revWord);

		int[] a = { 10, 51, 52, 56, 87, 92, 12, 45 };

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int s : a) {

			if (s > first) {

				second = first;
				first = s;

			} else if (s > second) {

				second = s;

			}

		}

		System.out.println(second);

		String rr = "jkdjnv  jndnj  nefnknkr  knjrnfn   jfnjfn erunf";

		rr = rr.replace(" ", "");
		System.out.println(rr);

		String name1 = "durga prasad ";
		char[] allChar = name1.toCharArray();

		Set<Character> repetitiveChar = new HashSet<>();
		Set<Character> nonRepetitiveChar = new HashSet<>();

		for (char one : allChar) {
			if (!nonRepetitiveChar.add(one)) {
				repetitiveChar.add(one);
			}
		}

		System.out.println("Duplicate characters: " + repetitiveChar);
		nonRepetitiveChar.removeAll(repetitiveChar);

		System.out.println("Non-duplicate characters: " + nonRepetitiveChar);

	}

}
