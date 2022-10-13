package com.ObjectClassMethods.practice;

public class FinalizeMethod 
{
	public static void main(String[] args) {
		FinalizeMethod f=new FinalizeMethod();
		System.out.println(f.hashCode());
		f=null;
		System.gc();
		System.out.println("garbage collector calling");
		//protected void finalize() 
		//{
		// System.out.println("finalize method calling");
		//}
		
	}

}
