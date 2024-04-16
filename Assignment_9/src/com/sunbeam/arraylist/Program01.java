package com.sunbeam.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Program01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(list.size());
		System.out.println(list.contains(30));
		System.out.println(list.indexOf(30));
		
		list.add(24);
		
		list.add(3,59);
		
		for(Integer val:list) {
			System.out.println(val);
		}
		
		System.out.println(list.get(3));
		System.out.println(list.contains(500));
		
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
