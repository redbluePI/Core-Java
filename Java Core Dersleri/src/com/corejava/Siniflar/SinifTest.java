package com.corejava.Siniflar;

public class SinifTest {
	String test1 = "basarili";
	public static void main(String[] args) {
		
		
		int i = 4;
		int k = i;
		i = 5;
		k = i;
		System.out.println("k = " + k);
		
		Kullanici k3 = new Kullanici();
		k3.isim = "Ahmet";
		Kullanici k4 = k3;
		System.out.println(k4.isim);
		
		
		
		
		System.out.println("----------------------------------------------------");
//default degerler
		Kullanici k1 = new Kullanici();
		System.out.println("Varsayilan degerler:" + k1.isim + " " + k1.id);
		
		k1.isim = "Ahmet";
		k1.id = 323;
		System.out.println(k1.isim + " " + k1.id);
		
		Kullanici k2;
		k2 = k1;
		k1.id = 209;
		System.out.println(k2.isim + " " + k2.id);
		//k2 = new Kullanici();
		System.out.println(k2.isim + " " + k2.id);
		
		System.out.println(k1.isimYazdir());
		System.out.println("----------------------------------------------------");
		SinifTest STest = new SinifTest();
		System.out.println(STest.test1);
	}

}
class Kullanici{
	String isim;
	int id;
	boolean b;
	char c;
	double d;
	
//metotlar
	void durumYaz() {
		System.out.println("Isim: " + isim + " ID: " + id);
	}
	String isimYazdir() {
		return "Isim: " + isim;
	}
}
