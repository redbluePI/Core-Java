package com.corejava.Siniflar;

public class MirasTest {

	public static void main(String[] args) {
		SubClass SC = new SubClass();
		SC.yaz();

	}

}


class SuperClass{
	protected double d = 3.1415;
	public SuperClass() {
		// TODO Auto-generated constructor stub
	}
	void yaz() {
		System.out.println(d);
	}
}
class SubClass extends SuperClass{

}
