package com.Training;

public class VariableNumber {
	
	// to avaid restricting user pass the numbers of arguments
	//we can go with variable number of arguments
	/*
	 * void Sum() { } void Sum(int a) { } void Sum(int a, int b) { } void Sum(int a,
	 * int b, int c) { } void Sum(int a, int b, int c, int d) { }
	 */
	// ctrl +shift + /    ==> comment out multiple lines
	
	static void print(int ...a) {
		System.out.println(a);
		System.out.println(a.length);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		print(10);
		print(10, 11);
		print(10, 20, 30);
		print(10, 12, 22, 34, 45, 47, 90, 76, 67);
	  } }
