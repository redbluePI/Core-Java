package com.corejava.Koleksiyonlar;

public class BagliNesneler {

	public static void main(String[] args) {
		Insan ilk = new Insan();
		ilk.isim = "Ahmet";
		Insan son;
		
		son = new Insan();
		son.isim = "Mehmet";
		ilk.sıradaki = son;

		son = son.sıradaki;

		Insan i = ilk;
		while(i != null) {
			System.out.println(i.isim);
			i = i.sıradaki;
		}
		
	}

}
class Insan{
	String isim;
	Insan sıradaki;
}
