package com.oops;

public class Method4 {
	//With ReturnType and With Parameter
public int division(int a, int b) {
	int c=a/b;
	return c;
}
public static void main(String[] args) {
	Method4 obj=new Method4();
	System.out.println(obj.division(80, 40));
}
}
