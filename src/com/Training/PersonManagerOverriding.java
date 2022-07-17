package com.Training;

class Person{
	
	
	//instance variable
	int age;       
	String name;
	int phoneNumber;
	static final String country= "Bangladesh";

// video 4@1:51
  @Override
  public String toString() {
	  String str= "Person values are name - " + this.name + "\nage-" + this.age + "\nphone number -"+ this.phoneNumber + "\ncountry" + country;
	  return str;
  }
  
public class PersonManagerOverriding {	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		Person p2=new Person();
		//Person  = class, P1= Reference value, new= allocate memory, person= constructor
		
		p1.name="Tarek";
		p1.age=35;
		p2.phoneNumber=1234567890;
		p2.name="Halim";
		p2.age=55;
		p1.phoneNumber=874567890;
       
		
		/*
		 * System.out.println(p1.name); System.out.println(p1.age);
		 * System.out.println(p1.phoneNumber); System.out.println(p2.name);
		 * System.out.println(p2.age); System.out.println(p2.phoneNumber);
		 */
		System.out.println(p1);
		System.out.println(p2);


	}

}
}
