package com.day10;

public class binarySearchAlgo {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		boolean flag = false;
		double k = 2.5;
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			System.out.println("mid " + mid + "low " + low + "high " + high);
			if (a[mid] == k) {
				System.out.println(mid);
				flag = true;
				break;
			} else if (a[mid] < k) {
				low = mid + 1;
			} else if (a[mid] > k) {
				high = mid - 1;
			}
		}
		System.out.println("low " + low + "high " + high);
		if (flag) {
			System.out.println("element found");
		}

	}

}
