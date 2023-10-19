package com.oops;
class a{
	void Bird() {
		System.out.println("I am a Bird");
	}
}
class b extends a{
	void Fish() {
		System.out.println("I am a Fish");
	}
}
class c extends b{
	void Cow() {
		System.out.println("I am bird and fish");
	}
}
public class Multilevel {
public static void main(String[] args) {
	c obj=new c();
	obj.Bird();
	obj.Fish();
obj.Cow();
}
}
