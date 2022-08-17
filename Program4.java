package com.number.program;

public class Program4 {
//Write a program to check if the given number is a
//Palindrome Number or not.The method should return the value and print it in main().

	static boolean isPalindrome(int n) {
int R,D,sum=0;
		
		D=n;
		
		while(n>0) {
		
		
	      R= n%10; 
	      
	      sum = (sum*10)+R;
	      
	    n= n/10; 
		}
		return D==sum;
		} 
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=121;
		if(isPalindrome(num)) {
			System.out.println(num +" is pallindrome");
		}
		else {
			System.out.println(num+" is not pallindrome");
		}
		
		
		
		
	}

}
