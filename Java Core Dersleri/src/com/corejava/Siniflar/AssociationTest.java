package com.corejava.Siniflar;

public class AssociationTest {

	public static void main(String[] args) {
		
		Ogretmen matematikci = new Ogretmen("Sevki");
		Ogrenci o1 = new Ogrenci("Ahmet");
		Ogrenci o2 = new Ogrenci("Mehmet");
		o1.ogretmen = matematikci;
		o2.ogretmen = matematikci;
		matematikci.ogrenci[0] = o1;
		matematikci.ogrenci[1] = o2;
		
		System.out.println(matematikci.ogrenci[0].isim);
		System.out.println(matematikci.ogrenci[1].isim);
	}

}
class Ogretmen{
	String isim;
	Ogrenci[] ogrenci;
	public Ogretmen(String isim){
		this.isim = isim;
		this.ogrenci = new Ogrenci[10];
	}
}
class Ogrenci{
	String isim;
	Ogretmen ogretmen;
	Ogrenci(String isim){
		this.isim = isim;
	}
}