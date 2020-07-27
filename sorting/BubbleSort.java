package com.sorting;

public class BubbleSort {
	public void bSort(int a[]) {
		for (int i=0; i<a.length-1; i++) {
			for (int j=0; j<a.length-i-1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	public void printArray(int [] a) {
		for (int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  arr[] = {4,2,9,7,1};
		BubbleSort obj = new BubbleSort();
		obj.printArray(arr);
		obj.bSort(arr);
		System.out.println("\n\nAfter Sort: ");
		obj.printArray(arr);
	
	}

}
