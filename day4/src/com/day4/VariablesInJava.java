package com.day4;



public class VariablesInJava {
	static int b;
	int a;
	void changevalue(int a)
	{
		this.a=a;
	}
public static void main(String[] args) {
	int b=20;
	VariablesInJava obj=new VariablesInJava();
	System.out.println(obj.a);
	obj.a=30;
	obj.changevalue(40);
	System.out.println(b);
	System.out.println(VariablesInJava.b);
	System.out.println(obj.b);
	System.out.println("message"+obj.a);
}
}
