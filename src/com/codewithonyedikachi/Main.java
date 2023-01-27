package com.codewithonyedikachi;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.remove(0);
		
		System.out.println(list.toArray());
	}
}
