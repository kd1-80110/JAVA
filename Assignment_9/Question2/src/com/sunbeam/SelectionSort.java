package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class SelectionSort {
static <T> void selectionSort(T[] arr, Comparator<T> c) {
	for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(c.compare(arr[i], arr[j]) > 0) {
				T temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
}

	public static void main(String[] args) {
		Double arr[] = new Double[]{10.1,1.1,5.5,2.2,7.7,6.1,4.1,9.1};
		
		ArrayComparator comparatorArr=new ArrayComparator();
		selectionSort(arr, comparatorArr);
		System.out.println(Arrays.toString(arr));
		for (Double double1 : arr) {
			System.out.println(double1);
		}

	}

}
