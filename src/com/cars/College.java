package com.cars;

public class College {
	
	
	public College() {//4
		this("tambaram");
		System.out.println("college name is mcc");
	}
	
	public College(String area) {//3
		this(625001);
		System.out.println("college location is "+area);
		
	}
	
	public College(int pin) {//2
		this(34908f);
		System.out.println("college pincode is "+pin);
	}
	public College(float count) {//1
		System.out.println("college count is "+count);
	}
	
		
		public static void main(String[] args) {
          College col = new College();
		  
		
		
	}

}
