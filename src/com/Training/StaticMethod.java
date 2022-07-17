package com.Training;

public class StaticMethod {
	
	static void Sum() {
		int i=15;
		int j=2;
		int c= i+j;  
		
	System.out.println("The sum of two values are  "+ c);
	}
	
	static int Sub() {
		
		int i=35;
		int j=20;
		int c= i-j;
		return c;         
		
	}
	
	 static int Multiplication(int a, int b) {
		 
		 int c= a*b;
		 return c;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------welcome to addition classes");
		Sum();   // no need to declare variable if static method   
		
		//AdditionMethod ad = new AdditionMethod();
		//ad.sum();  //30
		int d=Sub();
		System.out.println(d);
		
		int f=Multiplication(5, 5);
		System.out.println(f);
		
		
		
		}
	}
 



