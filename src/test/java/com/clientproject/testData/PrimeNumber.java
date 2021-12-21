package com.clientproject.testData;

import java.util.Scanner;

public class PrimeNumber {
	
	   

	public static void main(String[] args) {
		   
		   
		// TODO Auto-generated method stub
		   Scanner s = new Scanner(System.in);
		   System.out.println("Enter the Number");
		   int number = s.nextInt();
		   int temp =0;
		  // int  number =11;
		   
		   for(int i =2;i<=number-1;i++) {
			   
			   if(number%i ==0) {
				   
				   temp = temp +1;
			   }
			   
		   }
		   
		   if(temp ==0) {
			   
			   System.out.println(number+"is prime number");
		   }else {
			   
			   System.out.println(number+"is not prime");
		   }

	}

}
