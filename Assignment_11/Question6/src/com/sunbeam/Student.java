package com.sunbeam;


import java.util.Objects;
import java.util.Scanner;

public class Student /*implements Comparable<Book>*/{
	private int roll;
	private double price;
	private String name;
	private int quantity;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, double price, String authorName, int quantity) {
		this.roll = roll;
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(String isbn) {
		this.roll = roll;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return name;
	}

	public void setAuthorName(String authorName) {
		this.name = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll = ");
		roll = sc.nextInt();
		System.out.println("Enter the price = ");
		price = sc.nextDouble();
		System.out.println("Enter the Name = ");
		name = sc.next();
		System.out.println("Enter the Quantity = ");
		quantity = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Book [roll=" + roll + ", price=" + price + ", name=" + name + ", quantity=" + quantity
				+ "]";
	}
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(roll);
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
//		Student other = (Student) obj;
//		return Objects.equals(roll, other.roll);
//	}
	
//	@Override
//	public int compareTo(Book other) {
//		int diff=this.isbn.compareTo(other.isbn);
//		return diff;
//	}

}