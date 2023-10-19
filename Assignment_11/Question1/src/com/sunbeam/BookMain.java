package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BookMain {

	public static void main(String[] args) {
		
		Set<Book> set = new HashSet<>(); 
		
		set.add(new Book("1",1.1,"",1));
		set.add(new Book("4",2.0,"",3));
		set.add(new Book("3",3.1,"",4));
		set.add(new Book("2",4.0,"",2));
		set.add(new Book("6",5.1,"",1));
		set.add(new Book("4",6.0,"",4));
		
		Iterator<Book> itr = set.iterator();
		while(itr.hasNext()) {
			Book ele = itr.next();
			System.out.println(ele);
		}
//		for (Book book : set) {
//			System.out.println(book);
//		}
		
	}

}
