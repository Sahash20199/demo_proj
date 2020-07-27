package com.sorting;

public class QuickSort {
	public int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for (int j=low; j<= high-1; j++) { 
			if (arr[j] < pivot)  { 
				i+=1; 
		        int temp = arr[i];	arr[i] = arr[j];	arr[j] = temp;  
		    }  
		}  
		int temp = arr[i+1];	arr[i+1] = arr[high];	arr[high] = temp;    
		return (i+1);
	}
	public void qSort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			qSort(arr, low, pi-1);
			qSort(arr, pi+1, high);
		}
	}
	public void printElements (int [] arr) {
		for (int num : arr) {
			System.out.print(num+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,9,3,6,7};
		QuickSort obj = new QuickSort();
		obj.printElements(arr);
		obj.qSort(arr, 0, arr.length-1);
		System.out.println("\n After sort: ");
		obj.printElements(arr);

	}

}
