package com.sorting.factory;

public class SortingFactory {
	
	public Sorting getSorting(String sorting)
	{
		if(sorting.equalsIgnoreCase("bubblesort"))
			return new BubbleSort();
		else if(sorting.equalsIgnoreCase("insertionsort"))
			return new InsertionSort();
		else if(sorting.equalsIgnoreCase("quicksort"))
			return new QuickSort();
		else if(sorting.equalsIgnoreCase("selectionsort"))
			return new SelectionSort();
		else
			return null;
	}
	
}
