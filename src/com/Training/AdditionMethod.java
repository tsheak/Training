package com.Training;

public class AdditionMethod {
	void sum() {
		int i=10;
		int j=20;
		int c= i+j;  // Non Static without return
		
	System.out.println("The sum of two values are  "+ c);
	}
	
	int Sub() {
		
		int i=35;
		int j=20;
		int c= i-j;
		return c;          //non static with return value , This is local to it's function. No longer will be available to use
		
	}
	
	 int Multiplication(int a, int b) {
		 
		 int c= a*b;
		 return c;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------welcome to addition classes");
		
		AdditionMethod ad = new AdditionMethod();
		ad.sum();  //30
		
		int c=ad.Sub();                  //int c  Return value
		System.out.println(c*10000);

		int d=ad.Multiplication(51,54);
		System.out.println(d);
				
		}
	}
 

