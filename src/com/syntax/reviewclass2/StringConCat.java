package com.syntax.reviewclass2;

public class StringConCat {

	public static void main(String[] args) {
		
		String firstName="Chinzo";
		String lastName="Ganbold";
		String fullName=firstName+lastName;
		int num=10;
		int num2=10;
		System.out.println(fullName);
		System.out.println(firstName+num);
		System.out.println(firstName+num+num2); //1st operation=firstName+num
		System.out.println(firstName+(num+num2)); //1st operation (num+num2)
		System.out.println(num+firstName+num2);

	}

}
