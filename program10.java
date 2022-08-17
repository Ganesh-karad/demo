package com.number.program;

public class program10 {

	public static boolean isPrime(int a) {
		int count=0;	
				
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
			}
		
		return count==2;
	
}
	
	 static void isArmstrong(int a,int b) {
			
		  for(int i=a;i<=b;i++) {
				int num=i;
				int sum=0;
				int re;
				while(num>0) {
					re=num%10;
					sum=sum+(re*re*re);
					num=num/10;	
				}
				
				if(sum==i) {
					System.out.println("amstrong number "+sum);
				}}
			}
	
	static void oddNumber(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(i%2!=0) {
				System.out.println(i+ " odd number");	
	}
		}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int a=1 ;int b=10;	
		int n=10;
		System.out.println("Prime number 1 to 10");
		for(int i=a;i<=b;i++) {
		
		if(isPrime(i)) {
			
			System.out.println(i);}
		
		
		}
		
		
		isArmstrong(a,b);
		
		oddNumber(a,b);
		
	}

}
