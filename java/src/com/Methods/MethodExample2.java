package com.Methods;

public class MethodExample2 
{

	public void addition()
	{
		int var1=9;
		int var2=3;
		int var3=var1+var2;
		System.out.println(var3);
		
	}
	
	protected void subtraction()
	{
		int var1=9;
		int var2=3;
		int var3=var1-var2;
		System.out.println(var3);
		
		
		
	}
	
	private void multiplication()
	{
		int var1=9;
		int var2=3;
		int var3=var1*var2;
		System.out.println(var3);
		
		
	}
	
	
	public static void main(String[] args) 
	{
	
		MethodExample2 m2=new MethodExample2();
		m2.addition();
		m2.subtraction();
		m2.multiplication();
		
		MethodExaple1 m1=new MethodExaple1();
		m1.hello();
		m1.hi();
		
	}
}
