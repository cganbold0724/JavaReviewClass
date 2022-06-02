package com.syntax.reviewclass3;

public class IfElse2 {

	public static void main(String[] args) {
		
		String day="Friday"; // in non-primitive type variables we can store null which means nothing
		
		if(day.equals("Monday")) {
			System.out.println("weekday");
		}else if ("Tuesday".equals(day)) {
			System.out.println("weekday");
		}else if ("Wednesday".equals(day)) {
			System.out.println("weekday");
		}else if ("Thursday".equals(day)) {
			System.out.println("weekday");
		}else if ("Friday".equals(day)) {
			System.out.println("weekday");
		}else if ("Saturday".equals(day)) {
			System.out.println("weekend");
		}else if ("Sunday".equals(day)) {
			System.out.println("weekend");
			}
		
		System.out.println("----------------------");
		String country="USA";
		switch(country) {
		
		case "Turkey":
			System.out.println("Ankara");
			break;
		case "USA":
			System.out.println("DC");
			break;
		case "Serbia":
			System.out.println("Begrade");
			break;
		case "Albania":
			System.out.println("Tirana");
			break;
		case "Afghanistan":
			System.out.println("Kabul");
			break;
		case "Pakistan":
			System.out.println("Istamabad");
			break;
			default:
				System.out.println("Not a valid country");
			
		}

	}

}
