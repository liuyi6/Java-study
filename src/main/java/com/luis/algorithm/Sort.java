package com.luis.algorithm;
/**
 * 排序
 * Sort.java
 * @author luis
 * 2018年11月1日
 */
public class Sort {

	public static void main(String[] args) {
		int[] arr = {1,5,9,2,4,8,11,3};
		int[] array = Sort.bubbleSort(arr);
		for (int num : array) {
			System.out.print(num+"  ");
		}
	}
	
	/**
	 * 冒泡排序
	 * @param arr
	 * @return
	 */
	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
	            }
			}
		}
		return arr;
	}

}
