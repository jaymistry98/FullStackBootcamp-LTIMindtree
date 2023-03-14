package com.collectiondemos;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("adam");
		ar.add("sam");
		ar.add("sonal");
		ar.add("jay");
		ar.add(1, "matthew");
		
		ar.remove(3);
		
		//System.out.println(ar);
		
		for(String data: ar) {
			System.out.println(data);
		}
		
		System.out.println("data " + ar.get(2));
		System.out.println("data " + ar.indexOf("jay"));
	}

}
