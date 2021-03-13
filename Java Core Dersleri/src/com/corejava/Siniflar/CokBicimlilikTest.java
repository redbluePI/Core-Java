package com.corejava.Siniflar;

public class CokBicimlilikTest {

	public static void main(String[] args) {
		
		Çalışan c1, c2;
		c1 = new Çalışan("Ahmet");
		c2 = new Teknisyen("Mehmet");
		c1.getInfo();
		c2.getInfo();
		String s = 45 + 78 + "java";
		System.out.println(s);
	}

}
class Çalışan{
	String isim;
	public Çalışan(String isim) {
		this.isim = isim;
	}
	void getInfo() {
		System.out.println("Çalışan: " + isim);
	}
}
class Teknisyen extends Çalışan{

	public Teknisyen(String isim) {
		super(isim);
	}
	
	@Override
	public void getInfo() {
		System.out.println("Teknisyen: " + isim);
	}
}