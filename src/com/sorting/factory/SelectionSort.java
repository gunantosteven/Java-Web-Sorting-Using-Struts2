package com.sorting.factory;

public class SelectionSort extends Sorting {
	@Override
	public void sort() {
		for (int i=0; i<numbers.length-1; i++) {
	        for (int j=i+1; j<numbers.length; j++) {
	            if (numbers[i] > numbers[j]) {
	                //... Exchange elements
	                int temp = numbers[i];
	                numbers[i] = numbers[j];
	                numbers[j] = temp;
	            }
	        }
	    }
	}
}
