package com.Inheritance;

public class Test2 extends Test1
{

	public void addition()
	{
		int var1=90;
		int var2=3;
		int var3=var1+var2;
		System.out.println(var3);
		
	}
	
	public static void main(String[] args) 
	{
		Test2 t2=new Test2();
		t2.addition();
		t2.hello();
	}
}
