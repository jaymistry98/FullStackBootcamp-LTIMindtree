package com.day1;

public class DataStructure {
	
	//private static int size = 15;
	//private int[] data = new int[size];
	private int[] data = {2,3,4,5,6,7,8,10};
	
	/*
	public DataStructure() {
		for(int i =0; i < data.length; i++) {
			data[i] = i;
		}
	}
	*/
	public void printEven() {
		InnerEven even = new InnerEven();
		while(even.hasNext()) {
			System.out.println(even.getNext());
		}
	}
	
	private class InnerEven {
		private int next = 0;
		public boolean hasNext() {
			return (next <= data.length - 1);
		}
		public int getNext() {
			int retvalue = 0;
			if (data[next] % 2 ==0) {
				 retvalue = data[next];
			}
			next += 1;
			
			return retvalue;
		}
	}
	
	public static void main(String[] args) {
		DataStructure ds = new DataStructure();
		ds.printEven();
	}

}
