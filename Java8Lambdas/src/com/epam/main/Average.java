package com.epam.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Average 
{
	static double calculateavg(List<Integer> list)
	{
		Integer sum = 0;
		if(!list.isEmpty()) 
		{
			for (Integer i : list) 
			{
		        sum += i;
		    }
		    return sum.doubleValue() / list.size();
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		System.out.println("Enter 5 numbers");
		int i;
		for(i=0;i<5;i++) 
		{
		    int j = sc.nextInt();
		    mylist.add(j);
		}
		System.out.println(calculateavg(mylist));
		
	}

}
