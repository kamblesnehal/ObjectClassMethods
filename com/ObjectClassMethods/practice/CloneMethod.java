package com.ObjectClassMethods.practice;

public class CloneMethod implements Cloneable
{
	
		int i=10;
		int j=20;
		public static void main(String[] args) throws CloneNotSupportedException 
		{
		
			CloneMethod t1= new CloneMethod();
			CloneMethod t2= (CloneMethod)t1.clone();
            System.out.println(t1.i+"---"+t2.j);
			
		}
		
		
	}


