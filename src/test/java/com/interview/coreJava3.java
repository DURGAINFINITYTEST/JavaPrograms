package com.interview;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class coreJava3 {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		LinkedList<Integer> list2 = new LinkedList<Integer>();

		list.add(10);
		list.add(15);
		list.add(20);

		list.descendingIterator().forEachRemaining(list2::add);

		System.out.println(list2);

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		int arr[] = { 90, 50, 40, 78, 23, 89, 56 };

		for (int one : arr) {

			if (one > first) {
				second = first;
				first = one;
			} else if (one > second) {
				second = one;

			}
		}

		System.out.println(second);

		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy mm:HH:ss");
		Date date = new Date();
		System.out.println(s.format(date));

		String str1 = "abcdABCDabcdli";

		char[] chars = str1.toCharArray();

		Map<Character, Integer> charsCount = new HashMap<>();

		for (char c : chars) {
			if (charsCount.containsKey(c)) {
				charsCount.put(c, charsCount.get(c) + 1);
			} else
				charsCount.put(c, 1);
		}

		System.out.println(charsCount); // {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}

		String[] ar = null;
		System.out.println(arr);

		String textBlock = """
				Hi
				Hello
				Yes""";
		System.out.println(textBlock);

		LinkedList<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(15);
		li.add(20);
		li.add(40);
		li.forEach(System.out::print);
		System.out.println(li);

	}

}
