package com.interview;

import org.testng.asserts.SoftAssert;

public class janClass {

	public static void main(String[] args) {

		int k = 10;
		int l = 15;
		int m = k + l;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(m, 15);

		System.out.println("dibssbjb");

	}

}
