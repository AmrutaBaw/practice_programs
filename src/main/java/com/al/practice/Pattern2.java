package com.al.practice;

public class Pattern2 {
	public static void main(String args[])
	{
		int i,j;
		for(i=0;i<=6;i++)
		{
			for(j=6;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}		
}
