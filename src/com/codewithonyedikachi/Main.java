package com.codewithonyedikachi;


public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		System.out.println(list.indexOf(20));
}
}