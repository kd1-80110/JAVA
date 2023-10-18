package com.sunbeam;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list = new LinkedList<Employee>();
		Employee e;

		int choice;
		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("0. Exit");
			System.out.println("1. ADD");
			System.out.println("2. DELETE");
			System.out.println("3. FIND");
			System.out.println("4. SORT");
			System.out.println("5. EDIT / UPDATE");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 0:// Exit
				System.out.println("Exiting the program. Thank you!");
				break;

			case 1:// ADD
				e = new Employee();
				e.accept();
				list.add(e);
				break;

			case 2:// DELETE
				System.out.println("Enter the index to delete :");
				int id = sc.nextInt();
				list.remove(id);
				break;

			case 3:// FIND
				System.out.println("Enter the Id to search");
				int iddd = sc.nextInt();
				Employee key = new Employee();
				key.setId(iddd);
				int index = list.indexOf(key);
				if (index == -1)
					System.out.println("NOT Found" + iddd);
				else
					System.out.println("Found");
				e = list.get(index);
				System.out.println(e);
				break;

			case 4:// SORT
				class EmployeeComparator implements Comparator<Employee> {

					@Override
					public int compare(Employee e1, Employee e2) {
						int diff = e1.getId() - e2.getId();
						return diff;
					}

				}
				EmployeeComparator a = new EmployeeComparator();
				list.sort(a);
				for (Employee employee : list) {
					System.out.println(employee);
				}
				break;

			case 5:// EDIT/UPDATE
				System.out.println("Enter emp id to be modified: ");
				int id1 = sc.nextInt();
				Employee key1 = new Employee();
				key1.setId(id1);
				int index1 = list.indexOf(key1);
				if(index1 == -1)
				System.out.println("Employee not found.");
				else {
				Employee oldEmp = list.get(index1);
				System.out.println("Employee Found: " + oldEmp);
				System.out.println("Enter new information for the Employee");
				Employee newEmp = new Employee();
				newEmp.accept();
				list.set(index1, newEmp);
				}
				break;

			default:
				System.out.println("Wrong Choice Entered...");
				break;
			}

		} while (choice != 0);
	}

}
