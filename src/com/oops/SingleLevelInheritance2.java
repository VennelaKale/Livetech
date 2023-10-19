package com.oops;
class cow {
	void Manual() {
		System.out.println("Manual is Completed");
	}
}
class cat extends  cow{
	void Automation() {
		System.out.println("Automation is running");
	}
}
public class SingleLevelInheritance2 {
	public static void main(String[] args) {
		
cat obj=new cat();
	obj.Manual();
	obj.Automation();
}
}