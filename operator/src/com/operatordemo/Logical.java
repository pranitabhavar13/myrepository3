package com.operatordemo;

public class Logical {
	public static void main(String[] args) {
		
		//&& operator
		System.out.println((5>3)&&(8>5)); 	//True //T && T----> True otherwise False
		System.out.println((5>3)&&(8<5));	//false
		
		//|| operator
		System.out.println((5<3)||(8<5)); 	//F || F---->False otherwise True
		System.out.println((5<3)||(8>5));  	//True
		System.out.println((5>3)||(8<5)); 	//True
		
		//! operator
		System.out.println(!(5>3)); 		//False //!(T)--->False //!(F)---->True
		System.out.println((5>3)); 			//True
	}

}
