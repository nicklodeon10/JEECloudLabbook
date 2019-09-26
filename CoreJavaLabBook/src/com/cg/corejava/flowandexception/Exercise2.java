package com.cg.corejava.flowandexception;

public class Exercise2 {

	public int getNthFibonacciNonRec(int n) {
		int out=0;
		if(n==1) 
			out=1;
		else if(n==2) 
			out=1;
		else {
			int a=1;
			int b=1;
			int count=3;
			while(count<=n) {
				out=a+b;
				count++;
				a=b;
				b=out;
			}
		}return out;
	}
	
	public int getNthFibonacciRec(int n) {
	    if (n <= 1) 
	        return n; 
	     return getNthFibonacciRec(n-1) + getNthFibonacciRec(n-2);
	}
	
}
