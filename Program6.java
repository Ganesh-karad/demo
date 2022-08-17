package com.number.program;
//Write a program to print the factorial 
//of numbers in the range 
//of  10-30 (both inclusive).		

public class Program6 {
	static void factorialInteger(int a, int b) {
		  for (int i = a; i <= b; i++)
	        {
	            long k = 1;
	            for (int j = 1; j <= i; j++) {
	                k = k * j;
	            }
	 
	          System.out.printf("The factorial of %d is %d\n", i, k);
	        }
	    }
		
		
        
 
  
  
  
  
  
  
  
  
  
  
  public static void main(String[] args) {

    
	int b=20;
	int a=10;
	 
	factorialInteger(a,b);
	
	   
	    
	    

}}
