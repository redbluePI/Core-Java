package com.corejava.Siniflar;

public class SoyutlamaTest {

	public static void main(String[] args) {
		Ogrenci o1 = new Ogrenci();
		o1.isim = "Ahmet";
		o1.no = 729;
		o1.k1 = new Kalem();
		o1.k1.renk = "mavi";
		o1.k1.tip = 1;
		
		o1.yaz();
		Ogrenci o2 = new Ogrenci();
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
class Ogrenci{
	String isim;
	int no;
	Kalem k1;
	
	void yaz() {
		System.out.println("Ögrenci " + isim + ", " + k1.renk + " ile yaziyor.....");
	}

}