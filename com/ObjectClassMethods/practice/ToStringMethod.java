package com.ObjectClassMethods.practice;

public class ToStringMethod
{
	String name;
	int rollno;
	
	ToStringMethod()
	{

    }
	
	ToStringMethod(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public static void main(String[] args)
	{
		ToStringMethod t1=new ToStringMethod("ram",10);
		ToStringMethod t2=new ToStringMethod("sham",20);
		System.out.println(t1);
		System.out.println(t1.toString());
		System.out.println(t2);

	}
		
	}