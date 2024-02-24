package com.interview;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CharacterSeparation {

	public static void main(String[] args) {

		Set<Character> repetitive = new HashSet<Character>();
		Set<Character> nonRepetitive = new HashSet<Character>();
		String name1 = "durga prasad katakatla mani babu";

		for (char character : name1.toCharArray()) {
			if (!nonRepetitive.add(character)) {

				repetitive.add(character);
			}
		}

		System.out.println("Repetitive characters: " + repetitive);
		nonRepetitive.removeAll(repetitive);
		System.out.println("Non-repetitive characters: " + nonRepetitive);

		String num = "12545";
		int number = Integer.parseInt(num);
		System.out.println(number);

		String name = "Durga";
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.hashCode());
		System.out.println(sb.append(num));
		System.out.println(sb.hashCode());

		String one = "main methods ldll ";
		String two = one.replaceAll("\\s", "");
		System.out.println(two);

		int o = 0;
		do {
			System.out.println("iam durga");
			o++;
		} while (o >= 10);

		int[][][] threeDArray = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		// Accessing elements
		int value = threeDArray[1][0][1];
		System.out.println(value);

	}

}
