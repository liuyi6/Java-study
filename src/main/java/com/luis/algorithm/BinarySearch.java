package com.luis.algorithm;

/**
 * 二分法查找
 * BinarySearch.java
 * @author luis
 * 2018年11月1日
 */
public class BinarySearch {
	 public static int search(int[] arr, int des) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = (start + end) / 2;
            if (arr[temp] < des) {
            	start = temp + 1;
            } else if (arr[temp] > des) {
            	end = temp - 1;
            } else {
            	return temp;
            }
        }
        return -1;
	  }
	 
	 public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 8, 9, 12};
        int find = BinarySearch.search(arr, 3);
        if (find != -1) {
        	System.out.println("找到数值于索引" + find);
        } else {
        	System.out.println("找不到数值");
        }
	 }
}
