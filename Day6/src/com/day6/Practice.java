package com.day6;

public class Practice extends A{
 
	void operation()
	{
		System.out.println("child"+add(1,2));
		
	}
	static int multilication(int a,int b)
	{
		return (a*b)+10;
	}
	
	
	public static void main(String[] args) {
		Practice p=new Practice();
		p.operation();
		System.out.println("Parent "+p.multilication(1, 2));
		A a=new Practice();
		System.out.println("overrode should not get called so +10 will not ebe their"+a.multilication(1, 2));
		a.operation();
		
	}
}
