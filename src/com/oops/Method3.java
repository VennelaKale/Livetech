package com.oops;

public class Method3 {
//with return type and withoutparameter
	public int multiplication() {
		int a=10;
		int b=30;
		int c=a*b;
		return c;
		//System.out.println(c);
	}
	public static void main(String[] args) {
		Method3 obj=new Method3();
		System.out.println(obj.multiplication());
	}

}
