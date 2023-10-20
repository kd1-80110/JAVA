package com.sunbeam;

public class MainEmp {

	public static void main(String[] args) {
		Manager m=new Manager(1000,2000);
		System.out.println("Salary ="+m.getSal());//3000
		System.out.println("Incentive = "+m.calcIncentives());//200
		
		Labour l=new Labour(1000,200);
		System.out.println("Salary = "+l.getSal());//200000
		System.out.println("Incentive = "+l.calcIncentives());//10000
		
		Clerk c=new Clerk(5000);
		System.out.println("Salary = "+c.getSal());//5000
		System.out.println("Incentive = "+c.calcIncentives());//0.0
		
		Emp[] arr = new Emp[3];
		arr[0]=new Manager(2000,3000);
		arr[1]=new Labour(1000,3000);
		arr[2]=new Clerk(1000);
		
		double totalIncome=Emp.calcTotalIncom(arr);
		System.out.println("Total Income = "+ totalIncome);
	}

}
