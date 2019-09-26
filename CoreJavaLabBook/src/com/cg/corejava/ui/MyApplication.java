package com.cg.corejava.ui;

import java.util.Scanner;

import com.cg.corejava.flowandexception.Exercise3;
import com.cg.corejava.flowandexception.Exercise6;
import com.cg.corejava.flowandexception.exception.EmployeeException;

public class MyApplication {

	public static void main(String[] args) {
		
		/*
		 * int[] ar1= {213,123,54,3,212,12,5456,354,87,987}; System.out.println(new
		 * Exercise1().getSecondSmallest(ar1));
		 * 
		 * String[] ar2= {"I","am","on","a","Highway","to","Hell"};
		 * System.out.println(Arrays.toString(new
		 * Exercise2().getSortedStringWithCaseMod(ar2)));
		 * 
		 * System.out.println(Arrays.toString(new Exercise3().getSorted(ar1)));
		 * 
		 * char[] ar3="Hello This Is Me".toCharArray(); new Exercise4().getCount(ar3);
		 */
		
		/* System.out.println(new Exercise1().getSum(123)); */
		
		/* System.out.println(new Exercise1().getMessage()); */
		/*
		 * System.out.println(new Exercise2().getNthFibonacciNonRec(10));
		 * System.out.println(new Exercise2().getNthFibonacciRec(10));
		 */
		new Exercise3().printPrimes(20);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Salary: ");
		Integer salary=scanner.nextInt();
		try {
			new Exercise6().verifySalary(salary);
		} catch (EmployeeException e) {
			System.err.println(e.getMessage());
		}
		scanner.close();
	}

}
