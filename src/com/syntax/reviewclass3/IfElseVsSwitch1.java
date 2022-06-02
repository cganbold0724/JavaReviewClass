package com.syntax.reviewclass3;

public class IfElseVsSwitch1 {

	public static void main(String[] args) {
		
		String country="USA";
		String capital = null;
		switch(country) {
		
		case "Turkey":
			capital="Ankara";
			break;
		case "USA":
			capital="DC";
			break;
		case "Serbia":
			capital="Begrade";
			break;
		case "Albania":
			capital="Tirana";
			break;
		case "Afghanistan":
			capital="Kabul";
			break;
		case "Pakistan":
			capital="Istamabad";
			break;
				
		}
		System.out.println(capital);

	}

}
