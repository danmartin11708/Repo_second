package com.cars;

public class Ducati {

	public static void main(String[] args) {
		String s = "daniel"; 
		String rev="";
        
		for(int i=0; i<s.length(); i++) {
			rev=s.charAt(i) + rev;
					}
		System.out.println(rev);
	}
}
