package com.oops;

public class MethodOverloading {
void addition() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
void addition(int a, int b) {
	int d=a+b;
	System.out.println(d);
}
 float addition( float c,float d) {
float e=c+d;
System.out.println(e);
return e;
}
public static void main(String[] args) {
	MethodOverloading obj=new MethodOverloading();
	obj.addition();
	obj.addition(20, 40);
obj.addition(59.8f, 3.0f);
}
}
