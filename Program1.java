package com.number.program;

public class Program1 {
//Write a program to print  first 20 Fibonacci Series

	public static int fibonacciseries(int n) {
		int a=0,b=1,c=1;	
		for(int i=1;i<=n;i++) {
			c=a+b;
		
			a=b;
			b=c;
			
		}
		return c;
		
	}
	
	
	 
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=20;
		 
		 for(int i=1;i<=num;i++) {
	System.out.println( fibonacciseries(i));	
		 }
		
		
		
	}

}
