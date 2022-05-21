package com.operatordemo;

public class Incre {
	public static void main(String[] args) {
		
		//initializing variables
		int num=5;
		
		//first 5 gets printed & then increment to 6
		
		System.out.println("Post increment = " + num++);	//5
		
		System.out.println("Current value of num is:" +num); 	//6
		//num was 6,incremented to 7 then printed
		System.out.println("Pre-"+ "increment =" + ++num); 		//7
	}

}
