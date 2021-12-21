package com.clientproject.testData;

import java.util.Arrays;

public class SecondHighest {
	
	
	int intArray[]; 

	
	
public static int getSecondLargest(int [] a, int total) {
	
	
	int temp; 
	
	for(int i =0;i<total;i++) { //Running the loop for the array for each value
		
		
		for(int j =i+1;j<total;j++) {
			
			if(a[i] >a[j]) {
				
				
				temp = a[i];
				a[i] =a[j];
				a[j] =temp;
				//intArray.add(a[])
			}
			
			
			
		}
		
	}
	 System.out.println("Array in the Asceding order "+Arrays.toString(a));
	 return a[total-2];
}
        public static void main(String args[]){
        
        	
        	int a[]={110, 31, 15,56,73,22};
        	System.out.println();

        	
        	
        	System.out.println("Second Largest "+ getSecondLargest(a,6));
        	
        	
        	
        }
	
        

}
