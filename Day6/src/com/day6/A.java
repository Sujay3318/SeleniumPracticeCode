package com.day6;

public class A {

	
	int add(int a,int b)
	{
		return a+b;
	}
	int sub(int a,int b)
	{
		return a-b;
	}
	
	//we override static methods but cannot overload it
	static int multilication(int a,int b)
	{
		return a*b;
	}
	
	static int multilication(int a,int b,int c)
	{
		return a*b*c;
	}
	void operation()
	{System.out.println("parent");
		
	}
}
