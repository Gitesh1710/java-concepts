package com.interview.java.sorthashmap.comparator;

import java.util.Comparator;
import java.util.Map.Entry;

public class HashMapComparator implements Comparator<Entry<String, Integer>>{
	//Instance Variables to provide states
	private String sortBy;
	private boolean sortAscending;
	
	public HashMapComparator(String sortBy, boolean sortAscending) {
		this.sortBy = sortBy;
		this.sortAscending = sortAscending;
	}
	
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		if(sortBy=="value") {
			if(sortAscending==false) {
				return(o2.getValue()-o1.getValue());			
			}else {
				return(o1.getValue()-o2.getValue());
			}			
		}else {
			if(sortAscending==false) {
				return(o2.getKey().compareTo(o1.getKey()));			
			}else {
				return(o1.getKey().compareTo(o2.getKey()));
			}						
		}
	}

}
