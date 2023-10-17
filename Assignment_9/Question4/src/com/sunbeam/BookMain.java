package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		List<Book> list=new ArrayList<>();
		Book b;
		int index;
		int choice;
		do {
			//int choice;
			Scanner sc=new Scanner(System.in);
//			choice=sc.nextInt();
            System.out.println("0. Exit");
            System.out.println("1. Add new book");
            System.out.println("2. Display all books in forward order");
            System.out.println("3. Delete a book at a given index");
            System.out.println("4. Check if a book with ISBN is in the list");
            System.out.println("5. Delete all books");
            System.out.println("6. Display the number of books in the list");
            System.out.println("7. Sort all books by price in descending order");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
			
			switch(choice) {
			case 0://Exit
				System.out.println("Exiting the program. Thank you!");
				break;
				
			case 1://add book
				b=new Book();
				b.accept();
				list.add(b);
				break;
				
			case 2://display all
				for (Book book : list) {
					System.out.println(book);
					
				}
				break;
			
			case 3://remove at index
				System.out.println("Enter index which element to be deleted");
				index=sc.nextInt();
				list.remove(index);
				break;
				
			case 4://check if book present
				String isbn =sc.next();
				Book key=new Book();
				key.setIsbn(isbn);
				if(list.contains(key))
					System.out.println("Found");
				else
					System.out.println("Not Found");
				break;
				
			case 5://delete all books
				list.clear();
				break;
				
			case 6://display number of books
				System.out.println("Size: "+ list.size());
				break;
			
			case 7:
				class BookPriceComparator implements Comparator<Book>{
					public int compare(Book b1,Book b2) {
						int diff = -Double.compare(b1.getPrice(), b2.getPrice());
						return diff;
					}
				}
			}
			
		}while(choice!=0);
	}

}
