package com.array;

class Array {
	public void intersect (int[] a1, int[] a2) {
		System.out.println("----------------------");
		System.out.println("Common Elements: ");
		for (int i = 0; i<a1.length; i++)
			for (int j = 0;j<a2.length; j++)
				if (a1[i] == a2[j])
					System.out.print(a1[i]+ " ");
	}
	public int max( int[] arr) {
		int max = 0;
		for (int number: arr) {
			if (number > max) {
				max = number;
			}
		}
		return max;
	}
	public void reverse(int[] arr) {
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("After Reverse: ");
		for (int i = arr.length-1; i>=0; i-- )
			System.out.print(arr[i]+ " ");
	}
	public void insertAt(int[] arr, int item, int index) {
		int newarr[] = new int[arr.length+1];
		for (int j=0; j<index+1; j++ ) {
			if (j == index) {
				for (int i=arr.length-1; i>=j;i--) 
					newarr[i+1] = arr[i];
				newarr[j] = item;
			}
			else 
				newarr[j] = arr[j];
		}
		System.out.println("");
		System.out.println("------------------------");
		for (int num: newarr) 
			System.out.print(num+ " ");
	}
}


public class ArrayExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {7,5,8,3,4,65};
		int[] arr2 = {14,34,65,8,2,4,7};
		Array obj = new Array();
		System.out.println("Max element in array: " +obj.max(arr1));
		obj.intersect(arr1,arr2);
		obj.reverse(arr1);
		int item = 9, index = 3;
		obj.insertAt(arr1, item, index);	
	}
}
