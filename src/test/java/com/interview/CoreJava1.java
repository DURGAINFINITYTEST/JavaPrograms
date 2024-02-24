package com.interview;

import java.util.Arrays;

public class CoreJava1 {

	int name = 12;

	public static void main(String[] args) {

		int[] nums = { 10, 17, 48, 71, 45, 15, 13 };

		boolean status = false;
		int key = 5;
		Arrays.sort(nums);

		int l = 0;
		int h = nums.length - 1;

		while (l <= h) {

			int mid = (l + h) / 2;

			if (nums[mid] == key) {

				System.out.println("ELEMENT IDENTIFIED");
				status = true;
				break;
			}

			if (nums[mid] < key) {

				l = mid + 1;
			}

			if (nums[mid] > key) {

				h = mid - 1;

			}

		}

		if (status == false) {

			System.out.println("ELEMENT NOT  IDENTIFIED");

		}

	}

}
