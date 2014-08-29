package com.sorting.factory;

public class NumbersFactory {

	public static int[] getRandomNumbers(String tempat)
	{
		if(tempat.equalsIgnoreCase("ribuan"))
		{
			return randomWithRange(1, 1000);
		}
		else if(tempat.equalsIgnoreCase("sepuluh-ribuan"))
		{
			return randomWithRange(1,10000);
		}
		else if(tempat.equalsIgnoreCase("ratus-ribuan"))
		{
			return randomWithRange(1,100000);
		}
		else if(tempat.equalsIgnoreCase("jutaan"))
		{
			return randomWithRange(1,1000000);
		}
		else if(tempat.equalsIgnoreCase("sepuluhjuta"))
		{
			return randomWithRange(1,10000000);
		}
		else
			return null;
	}
	
	public static int[] randomWithRange(int min, int max)
	{
		int[] randomNumbers = randomNumbers = new int[max];
		int range = (max - min) + 1;     
		for(int i = 0; max > i; i++)
		{
			randomNumbers[i] = (int)(Math.random() * range) + min;
		}
		
		return randomNumbers;
	}
}
