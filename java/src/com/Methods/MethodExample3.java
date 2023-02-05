package com.Methods;

public class MethodExample3

{
	public void addition()
	{
		int var1=90;
		int var2=3;
		int var3=var1+var2;
		System.out.println(var3);
		
	}
	
	protected void subtraction()
	{
		int var1=90;
		int var2=3;
		int var3=var1-var2;
		System.out.println(var3);
		
		
		
	}
	
	private void multiplication()
	{
		int var1=9;
		int var2=30;
		int var3=var1*var2;
		System.out.println(var3);
		
		
	}
	
	int var1=8;
	int var2=4;
	private void addition1()
	{
		int var3=var1+var2;
		System.out.println(var3);
	}
	
	private void multiplication(int var1,int var2)
	{
		
		int var3=var1*var2;
		System.out.println(var3);
	}
	
	public static void main(String[] args) 
	{

	MethodExample3 m3=new MethodExample3();
	m3.addition();
	m3.subtraction();
	m3.multiplication();
	m3.multiplication(76, 8);
	m3.addition1();
	
	}
	
	
}
