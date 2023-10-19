package com.oops;

public class Method1 {
//Method withoutparameter and WithoutReturntype
	public void addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void name() {
		String name="Livetech";
		System.out.println(name);
	}
	public static void main(String[] args) {
		Method1 obj=new Method1();
		obj.addition();
		obj.name();
	}
}
