package com.day3;

public class Child extends Parent {
	int cv = 30;
	int ov = 40;

	void childMethod() {
		System.out.println("run in child");
	}

	void parentmethodoverrideinchild() {
		System.out.println("child implemenation");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod(); // child will get all parent values and methods in it
		c.childMethod();
		System.out.println("child variable" + c.cv);
		System.out.println("child override variable" + c.ov);
		System.out.println("parent variable" + c.pv);

		System.out.println("************************************");
		Parent p = new Parent();
		p.parentmethodoverrideinchild();
		p.parentMethod();
		System.out.println("parent variable" + p.pv);
		System.out.println("parent override variable" + p.ov);

		System.out.println("************************************");
		Parent pc = new Child();
		pc.parentMethod();
		pc.parentmethodoverrideinchild();// it will call override method in child
		System.out.println("parent variable" + pc.pv);
		System.out.println("parent override variable" + pc.ov); // it will not call override variable from child
		// variable in java do not follow polymorphism and overriding

	}
}
