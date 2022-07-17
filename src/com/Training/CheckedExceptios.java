package com.Training;

public class CheckedExceptios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is the beginning");
		
		//Thread.sleep(2000);   //Compile Time Exception     InterruptedException (by mouse hover)
		
		//We have to try and catch to solve the problem
		
		try {
			Thread.sleep(2000); 
		}
		
		catch(InterruptedException ex) 
		{
			System.out.println("This is InterruptedException");  // if no exception found, it will not print
		}
		System.out.println("This is the ending");

	}

}
