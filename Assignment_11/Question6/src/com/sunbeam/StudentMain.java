package com.sunbeam;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.plaf.basic.BasicToolBarSeparatorUI;

public class StudentMain {

	public static void main(String[] args) {
		
		Map<Integer,Student> map = new LinkedHashMap<>();
		int choice;
		
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("0. Exit");
			System.out.println("1. Insert In Map");
			System.out.println("2. Find the Map");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice){
			case 0:// Exit
				System.out.println("Exiting the program. Thank you!");
				break;
			case 1:
				Student s=new Student();
				s.accept();
				map.put(s.getRoll(), s);
				break;
			case 2:
				System.out.println("Enter Student to search");
				int roll = sc.nextInt();
				Student r = map.get(roll);
				if(r !=null) {
					System.out.println("Student is Found");
					System.out.println(map.toString());
				}
				else
					System.out.println("Student is not Found");
				break;
				
			}
		}while (choice != 0);
	
		
	}

}
