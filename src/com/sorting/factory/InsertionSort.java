package com.sorting.factory;

public class InsertionSort extends Sorting {
	@Override
	public void sort() {
		 int j;                     // the number of items sorted so far
	     int key;                // the item to be inserted
	     int i;  

	     for (j = 1; j < numbers.length; j++)    // Start with 1 (not 0)
	    {
	           key = numbers[ j ];
	           for(i = j - 1; (i >= 0) && (numbers[ i ] < key); i--)   // Smaller values are moving up
	          {
	        	   numbers[ i+1 ] = numbers[ i ];
	          }
	           numbers[ i+1 ] = key;    // Put the key in its proper location
	     }
	}
}
