package com.ObjectClassMethods.practice;

public class HashcodeMethod 
{
	String s;
	
	
	
	public HashcodeMethod(String s) {
		super();
		this.s = s;
	}



	public static void main(String[]ar)
	{
		
		
		
		HashcodeMethod hs=new HashcodeMethod("Snehal");
		
		System.out.println(hs.hashCode());
		
	}

		
	

}
