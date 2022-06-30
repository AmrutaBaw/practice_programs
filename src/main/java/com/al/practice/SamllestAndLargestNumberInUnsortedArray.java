package com.al.practice;

public class SamllestAndLargestNumberInUnsortedArray {
	public static void main(String args[])
	{
		int Unsortedarray[]= {6,1,7,2,5,3,4,0,8};
		int min=Unsortedarray[0];
		int max=Unsortedarray[0];
		
		int arraylenght=Unsortedarray.length;
		for(int i =0;i<arraylenght;i++)
		{
			if(Unsortedarray[i]>max)
			{
				max=Unsortedarray[i];
			}
			if(Unsortedarray[i]<min)
			{
				min=Unsortedarray[i];
			}
			
		}
		System.out.println("Smallest number of unsorted array is :"+min);
		System.out.println("Largest number of unsorted array is :"+max);
	}

}
