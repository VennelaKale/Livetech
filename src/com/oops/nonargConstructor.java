package com.oops;

public class nonargConstructor {
private String Studentname;
private int rollno;
private long phoneno;
nonargConstructor(){
	Studentname="Livetech";
	rollno=1234;
	phoneno=9876567897L;
}
void Display() {
	System.out.println("Student name is:"+Studentname);
	System.out.println("Student rollno is:"+rollno);
	System.out.println("Student phone number is:"+phoneno);
}
public static void main(String[] args) {
	nonargConstructor obj=new nonargConstructor();
	obj.Display();
}
}
