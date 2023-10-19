package com.sunbeam;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class BookMain {

	public static void main(String[] args) {
		class BookPRICEComparator implements Comparator<Book> {
			@Override
			public int compare(Book b1, Book b2) {
				int diff = -Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
		}
		BookPRICEComparator nameComparator = new BookPRICEComparator();
		
		TreeSet<Book> set = new TreeSet<>(nameComparator); // duplicate based on nameComparator.compare()
		
		//Set<Book> set = new TreeSet<>(); // duplicate based on Book's hashCode() + equals()
		
		set.add(new Book("1",1.1,"",1));
		set.add(new Book("4",2.0,"",3));
		set.add(new Book("3",3.1,"",4));
		set.add(new Book("2",4.0,"",2));
		set.add(new Book("6",2.0,"",1));
		set.add(new Book("4",6.0,"",4));
		
		Iterator<Book> itr = set.iterator();
		while(itr.hasNext()) {
			Book ele = itr.next();
			System.out.println(ele);
		}
		
		System.out.println("Descending Iterator");
		Iterator<Book> itr1 = set.descendingIterator();
		while(itr1.hasNext()) {
			Book ele = itr1.next();
			System.out.println(ele);
		}
		
		
//		for (Book book : set) {
//			System.out.println(book);
//		}
		
	}

}
