package com.codewithonyedikachi;

public class Array {
	private int[] items;
	private int count;
	private int length;
	
	public Array(int length) {
		this.length = length;
		items = new int[length];

	}
	
	public void insert(int item) {
		
		if (items.length == count) {
			int[] newItems = new int[count * this.length];
			
			for (int i = 0; i < count; i++)
				newItems[i] = items[i];
			items = newItems;
		}
		items[count++] = item;
		
	}
	
	public int indexOf(int item) {
		for (int i = 0; i < count; i++)
			if (items[i] == item)
				return i;
		return -1;
	}
	
	public void removeAt(int index) {
		
		if (index < 0 || index >= count)
			throw new IllegalArgumentException();
		for (int i = index; i < count; i++)
			items[i] = items[i+1];
		count--;
	}
	
	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}
}
