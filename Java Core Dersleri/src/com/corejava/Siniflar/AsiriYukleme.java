package com.corejava.Siniflar;

public class AsiriYukleme {
	float s;
	
	public static void main(String[] args) {
		AsiriYukleme AYukleme = new AsiriYukleme();
		AYukleme.yaz(3.14);

	}
	
	void yaz(String s) {
		System.out.println("String tip: " + s);
	}
	void yaz(int s) {
		System.out.println("int tip: " + s);
	}
	void yaz(double s) {
		System.out.println("double tip: " + s);
	}

}

