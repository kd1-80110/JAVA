package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringMaxLength {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		Collections.addAll(list, "Suyash", "Ojaswi", "Akhilesh", "Prasanna", "Akash");
		for (String string : list) {
			System.out.println(string);
		}

		class StringCompare implements Comparator<String> {

			@Override
			public int compare(String arg0, String arg1) {
				int diff = (arg0.length() - arg1.length());
				return diff;
			}

		}
		StringCompare sc = new StringCompare();
		System.out.println("String with Max Length - " + Collections.max(list, sc));

	}

}
