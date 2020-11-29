package com.interview.java.sorthasmap.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.interview.java.sorthashmap.comparator.HashMapComparator;

public class HashMapComparatorMain {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Gitesh", 95);
		map.put("Jack",93);
		map.put("TJ", 99);
		map.put("Viktor", 64);
		map.put("Rebecca",100);
		
		//convert this map to list of Entries
		
		List<Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(map.entrySet());
		
		//Sending list to comparator for sorting
		
		Collections.sort(entryList, new HashMapComparator("value",true));
		
		//Storing sorted entryList in map
		
		Map<String, Integer> sortedMap =  new LinkedHashMap<String, Integer>();
		for(Entry<String, Integer> entry: entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(sortedMap);
	}

}
