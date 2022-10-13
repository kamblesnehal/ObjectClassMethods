package com.ObjectClassMethods.practice;

public class EqualsMethod 
{
	String nameofbank;
	int bankid;
	EqualsMethod(String nameofbank,int bankid)
	{
		this.nameofbank=nameofbank;
		this.bankid=bankid;
	}
	public static void main(String[] args) 
	{
		EqualsMethod e1=new EqualsMethod("Union",45689);
		EqualsMethod e2=new EqualsMethod("Union",45689);
		EqualsMethod e3=new EqualsMethod("BankOfIndia",45667890);
		EqualsMethod e4=e1;
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));

	}

}
