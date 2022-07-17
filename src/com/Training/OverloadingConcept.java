package com.Training;

public class OverloadingConcept {
	
	static void Sum( int a, int b) {
		
		System.out.println(a + "+" + b+  " =" + ( a+b));
	}
      static void Sum( double a, double  b) {
    	  //same method, different signature = Method Overloading
		
		System.out.println(a + "+" + b+  " =" + ( a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Welcome to Overloading Practice!");
		Sum(10, 20);  // Overloading write one time and use multiple time
		Sum(10, 25);
		Sum(12, 20);
		Sum(10, 35);
		Sum(110.5, 20.5);  // It will error as int, so we need another function/method for double 
		Sum(13, 20);
		Sum(102.5, 20.5);
		Sum(101, 20.5);

	}

}
