package com.Training;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P p= new P();
		p.m1();
		
		C c=new C();
		c.m1();
		
		P p1=new C();  // If non static  Then It will print    Child    // Runtime will get priority
		p1.m1();       // Method Hiding    , Both methods are static In this case   Reference type will get priority   // Not the Runtime ?? Will Print Paren
		
		
		
		
		
		
	
	}

}
