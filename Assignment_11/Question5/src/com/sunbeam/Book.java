package com.sunbeam;


import java.util.Objects;
import java.util.Scanner;

public class Book /*implements Comparable<Book>*/{
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the isbn = ");
		isbn = sc.next();
		System.out.println("Enter the price = ");
		price = sc.nextDouble();
		System.out.println("Enter the Author name = ");
		authorName = sc.next();
		System.out.println("Enter the Quantity = ");
		quantity = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(isbn);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		return Objects.equals(isbn, other.isbn);
//	}
	
//	@Override
//	public int compareTo(Book other) {
//		int diff=this.isbn.compareTo(other.isbn);
//		return diff;
//	}

}