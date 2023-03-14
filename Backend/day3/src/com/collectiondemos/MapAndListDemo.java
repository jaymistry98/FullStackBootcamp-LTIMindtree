package com.collectiondemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapAndListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		map.put("USA", new ArrayList<String>(Arrays.asList("Boston", "New York", "Chicago")));
		map.put("UK", new ArrayList<String>(Arrays.asList("London", "Liverpool", "Manchester")));
		map.put("INDIA", new ArrayList<String>(Arrays.asList("Mumbai", "Delhi", "Pune")));
		
		for(Map.Entry<String, ArrayList<String>> entry :map.entrySet()) {
			System.out.println("Getting the list of countries " + entry.getKey());
			for(String city: entry.getValue()) {
				System.out.println(city);
			}
			System.out.println("-------------");
		}
	}

}
