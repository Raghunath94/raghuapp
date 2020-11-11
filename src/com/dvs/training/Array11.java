package com.dvs.training;

public class Array11 {

public static void main(String[] args) {

	        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
	        int sum = 0;
	      //  Double average;
	     
	        // for each loop is used to access elements 
	        for (int number: numbers) {
	            sum += number;
	        }
	        
	//        arrayLength = numbers.length;

	        // Change sum and arrayLength to double as average is in double
	    //    average =  ((double)sum / (double)arrayLength);

	        System.out.println("Sum = " + sum);
	     //   System.out.println("Average = " + average);
	        int[] age = new int[5];

	        // insert 14 to third element
	        age[2] = 14;

	        // insert 34 to first element
	        age[0] = 34;
	        //insert 4th element 
	       // age[3] = 22;
	        //insert 3rd element
	        age[2]= 12;

	        for (int i = 0; i < 5; ++i) {
	            System.out.println("Element at index " + i +": " + age[i]);
	           
	        }
	}
}
