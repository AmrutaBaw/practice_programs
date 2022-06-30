package com.al.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method arrayList<>stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(16);
		list.add(1);
		
		Iterator<Integer> itr = list.iterator();
		Collections.sort(list);
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		
		for(Integer itr1:list)
		{
			System.out.println(itr1);
		}
	}

}
