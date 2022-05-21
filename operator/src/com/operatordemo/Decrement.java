package com.operatordemo;

public class Decrement {
	
public static void main(String[] args) {
		
		//initializing variables
		int num=5;
		
		//first 5 gets printed & then decrement to 4
		
		System.out.println("Post decrement = " + num--);	//5
		
		System.out.println("Current value of num is:" +num); 	//4
		//num was 4,decremented to 3 then printed
		System.out.println("Pre-"+ "decrement =" + --num); 		//3
	}


}
