package com.sorting.factory;

public abstract class Sorting {
	protected int[] numbers;
	
	public abstract void sort();
	
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	public int[] getNumbers() {
		return numbers;
	}
}
