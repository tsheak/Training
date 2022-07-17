package com.Training;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 10;
		
		double b=a;
		
		System.out.println(b); // AutoType casting    Smaller to larger    int ==> Double
		
		double d1=10.9;
		int a1= (int)d1;
		System.out.println(a1);   // Explicit Type casting, larger to smaller  double ==> int (Forcing)
		

	}

}
