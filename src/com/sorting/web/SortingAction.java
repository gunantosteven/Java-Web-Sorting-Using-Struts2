package com.sorting.web;

import java.util.concurrent.TimeUnit;

import com.opensymphony.xwork2.ActionSupport;
import com.sorting.factory.BubbleSort;
import com.sorting.factory.InsertionSort;
import com.sorting.factory.NumbersFactory;
import com.sorting.factory.QuickSort;
import com.sorting.factory.SelectionSort;
import com.sorting.factory.Sorting;
import com.sorting.factory.SortingFactory;

public class SortingAction extends ActionSupport {
	private String tempat;
	private int tipeSorting;
	private long time;
	
	public String getTempat() {
		return tempat;
	}
	
	public void setTempat(String tempat) {
		this.tempat = tempat;
	}
	
	public int getTipeSorting() {
		return tipeSorting;
	}
	
	public void setTipeSorting(int tipeSorting) {
		this.tipeSorting = tipeSorting;
	}
	
	public long getTime() {
		return time;
	}
	
	public void setTime(long time) {
		this.time = time;
	}
	
	public String execute()
	{
		long startTime = System.nanoTime();  
		Sorting sorting;
		SortingFactory sortingFactory = new SortingFactory();
		if(tipeSorting == 1)
			sorting = sortingFactory.getSorting("bubblesort");
		else if(tipeSorting == 2)
			sorting = sortingFactory.getSorting("insertionsort");
		else if(tipeSorting == 3)
			sorting = sortingFactory.getSorting("quicksort");
		else if(tipeSorting == 4)
			sorting = sortingFactory.getSorting("selectionsort");
		else 
			return "error";
		
		sorting.setNumbers(NumbersFactory.getRandomNumbers(tempat));
		sorting.sort();
		
		time = System.nanoTime() - startTime;
		
		
		return "success";
	}
}
