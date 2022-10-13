package com.ObjectClassMethods.practice;

public class GetClassMethod 
{
	public static void main(String[] args) {
		
		Object obj=new Object() ;
		Class a= obj.getClass();
		System.out.println("Class of Object obj is:" + a.getName());
	}

}
