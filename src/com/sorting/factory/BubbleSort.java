package com.sorting.factory;

public class BubbleSort extends Sorting {
	
	@Override
	public void sort() {
		int n = numbers.length;
	    for (int pass=1; pass < n; pass++) {  // count how many times
	        // This next loop becomes shorter and shorter
	        for (int i=0; i < n-pass; i++) {
	            if (numbers[i] > numbers[i+1]) {
	                // exchange elements
	                int temp = numbers[i];  numbers[i] = numbers[i+1];  numbers[i+1] = temp;
	            }
	        }
	    }
	}
	
}
