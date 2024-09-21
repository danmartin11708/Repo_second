package com.cars;

public class MaduraiAnnanagar {
	
	public static void main (String[] args){
		
		String s="daniel martin";
		
		int len=s.length();
		System.out.println(len);
		
		Boolean contain=s.contains("i");
		System.out.println(contain);
		
		Boolean ends=s.endsWith("n");
		System.out.println(ends);
		
		char pos=s.charAt(5);
		System.out.println(pos);
		
		int indexOf = s.indexOf('a');
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		System.out.println(String.valueOf(pos).toUpperCase());
		
		
		for(int i=s.length(); i<s.length();i--)
		{
		System.out.println(s.charAt(i));
		}
		
		
		
		
	
		}

}
