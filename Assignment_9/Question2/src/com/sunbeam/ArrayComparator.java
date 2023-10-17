package com.sunbeam;

import java.util.Comparator;

public class ArrayComparator implements Comparator<Double>{

	@Override
	public int compare(Double s1, Double s2) {
		// TODO Auto-generated method stub
		int diff = Double.compare(s1.doubleValue(), s2.doubleValue());
		return diff;
	}

}
