package com.sunbeam;

import java.util.Scanner;

public class Book {
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the isbn = ");
		isbn=sc.next();
		System.out.println("Enter the price = ");
		price=sc.nextDouble();
		System.out.println("Enter the Author name = ");
		authorName=sc.next();
		System.out.println("Enter the Quantity = ");
		quantity=sc.nextInt();
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	
}
