package com.java.assessment;

import java.util.HashMap;
import java.util.Scanner;

public class Answer4 {

	static void minimumVisibleBottles(int[] arr, int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
			ans = Math.max(ans, map.get(arr[i]));
		}

		System.out.print(ans + "\n");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		minimumVisibleBottles(arr, n);
		sc.close();

	}
}
