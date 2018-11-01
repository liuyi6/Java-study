package com.luis.algorithm;

/**
 * 冒泡排序
 * BubbleSort.java
 * @author luis
 * 2018年11月1日
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {1,5,9,2,4,8,11,3};
		int[] array = BubbleSort.bubbleSort1(arr);
		for (int num : array) {
			System.out.print(num+"  ");
		}
	}

	
	public static int[] bubbleSort1(int [] arr){
		int i, j , n= arr.length; 
		for(i=0; i<n; i++){
			//表示n次排序过程。 
			for(j=1; j<n-i; j++){ 
				if(arr[j-1] > arr[j]){
					//前面的数字大于后面的数字就交换 
					//交换a[j-1]和a[j] 
					int temp = arr[j-1]; 
					arr[j-1] = arr[j]; 
					arr[j]=temp; 
					} 
				} 
			}
		return arr;
	}
}
