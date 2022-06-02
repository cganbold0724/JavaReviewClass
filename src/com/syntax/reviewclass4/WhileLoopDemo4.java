package com.syntax.reviewclass4;

import java.util.Scanner;

public class WhileLoopDemo4 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int x=0;
		
		while(x!=10) {
			System.out.println("Please enter the number");
		    x=input.nextInt();
			System.out.println(x+2);
		}
		input.close();

	}

}
