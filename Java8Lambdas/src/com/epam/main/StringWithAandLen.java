package com.epam.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringWithAandLen 
{
	public static List<String> search(List<String> mylist) 
	{
		return mylist.stream()
			  .filter(s -> s.startsWith("a"))
			  .filter(s -> s.length() == 3)
			  .collect(Collectors.toList());
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> mylist =  new ArrayList<String>();
		mylist.add("abc");
		mylist.add("aer");
		mylist.add("hello");
		mylist.add("air");
		mylist.add("aeroplane");

	System.out.println(search(mylist));
		
		
	}
}
