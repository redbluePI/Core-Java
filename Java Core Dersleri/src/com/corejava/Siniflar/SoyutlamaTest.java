package com.corejava.Siniflar;

public class SoyutlamaTest {

	public static void main(String[] args) {
		Ogrenciler o1 = new Ogrenciler();
		o1.isim = "Ahmet";
		o1.no = 729;
		o1.k1 = new Kalem();
		o1.k1.renk = "mavi";
		o1.k1.tip = 1;
		
		o1.yaz();
		Ogrenciler o2 = new Ogrenciler();
		o2.isim = "Mehmet";
		o2.no = 735;
		o2.k1 = new Kalem();
		o2.k1.renk = "siyah";
		o2.k1.tip = 1;
		o2.yaz();
	}

}
class Kalem{
	String renk;
	int tip;
}
class Ogrenciler{
	String isim;
	int no;
	Kalem k1;
	
	void yaz() {
		System.out.println("Ögrenci " + isim + ", " + k1.renk + " ile yaziyor.....");
	}

}