package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookMain {

	public static void writeBook(ArrayList<Book> list) {
		try (FileOutputStream fout = new FileOutputStream("Books.txt")) {
			try (DataOutputStream dout = new DataOutputStream(fout)) {
				for (Book b3 : list) {
					dout.writeUTF(b3.getIsbn());
					dout.writeDouble(b3.getPrice());
					dout.writeUTF(b3.getAuthorName());
					dout.writeInt(b3.getQuantity());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("SAVED Books In File");

	}

	public static void readBook(ArrayList<Book> list) {
		try (FileInputStream fin = new FileInputStream("Books.txt")) {
			try (DataInputStream din = new DataInputStream(fin)) {
				while (true) {
					Book b3 = new Book();
					b3.setIsbn(din.readUTF());
					b3.setPrice(din.readDouble());
					b3.setAuthorName(din.readUTF());
					b3.setQuantity(din.readInt());
					System.out.println(b3);
				}
			}
		} catch (EOFException e) {
			// do nothing
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("LOADED Books In File");

	}

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		Book b;
		int index = 0;
		int choice;
		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("0. Exit");
			System.out.println("1. Add a new book in List");
			System.out.println("2. Display all books in forward order using random access");
			System.out.println("3. Search a book with given isbn[HINT:-indexOf()]");
			System.out.println("4. Delete a book at given index");
			System.out.println("5. Delete a book at given isbn");
			System.out.println("6. Reverse the list[HINT:-Collections.reverseList(]");
			System.out.println("7. Save books in file");
			System.out.println("8. Load books in file");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 0:// Exit
				System.out.println("Exiting the program. Thank you!");
				break;

			case 1:// add book in list
				b = new Book();
				b.accept();
				if (list.contains(b)) {
					index = list.indexOf(b);
					// Book bk = list.get(index);
					b.setQuantity(b.getQuantity() + 1);
					list.set(index, b);

					System.out.println("Book is present,Increment Quantity");

				} else {
					System.out.println("Book is not present,then add a new book");
					list.add(b);
				}
				break;

			case 2:// display all books in forward order using random accesss
				for (Book book : list) {
					System.out.println(book);
				}
				break;

			case 3:// Search a book with given isbn[HINT:-indexOf()]
				String isbn = sc.next();
				Book key = new Book();
				key.setIsbn(isbn);
				if (list.contains(key)) {
					System.out.println("Found");
					int ind = list.indexOf(key);
				} else
					System.out.println("Not Found");
				break;

			case 4:// Delete a book at given index
				System.out.println("Enter the index to delete :");
				int in = sc.nextInt();
				if (in >= 0 && in < list.size()) {
					b = list.get(in);
					list.remove(in);
					System.out.println("BOOK REMOVED : " + b);

				} else

					System.out.println("Wrong index");
				break;

			case 5:// Delete a book at given isbn
				String isbn1 = sc.next();
				Book key1 = new Book();
				key1.setIsbn(isbn1);
				if (list.contains(key1)) {
					System.out.println("Found");
					int ind = list.indexOf(key1);
					list.remove(index);
				}
				break;

			case 6:// Reverse the list[HINT:-Collections.reverseList(]
				Collections.reverse(list);
				System.out.println("Reversed List : " + list);
				break;

			case 7:// Save books in file
				writeBook(list);
				break;

			case 8: // Load books in file
				readBook(list);
				break;

			default:
				System.out.println("Wrong Choice Entered...");
				break;
			}

		} while (choice != 0);
	}

}