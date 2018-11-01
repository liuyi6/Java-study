package com.luis.algorithm;

/**
 * 冒泡排序 BubbleSort.java
 * 
 * @author luis 2018年11月1日
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 9, 2, 4, 8, 11, 3 };
		int[] array = BubbleSort.bubbleSort3(arr);
		for (int num : array) {
			System.out.print(num + "  ");
		}
	}

	public static int[] bubbleSort1(int[] arr) {
		int i, j, n = arr.length;
		for (i = 0; i < n; i++) {
			for (j = 1; j < n - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] bubbleSort2(int[] arr) {
		int k = arr.length;
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int j = 1; j < k; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			k--;
		}
		return arr;
	}

	public static int[] bubbleSort3(int[] arr) {
		int flag = arr.length;
		while (flag > 0) {
			int k = flag;
			flag = 0;
			for (int j = 1; j < k; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					flag = j;
				}
			}
		}
		return arr;
	}
}
