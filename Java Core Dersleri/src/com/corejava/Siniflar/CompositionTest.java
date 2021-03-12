package com.corejava.Siniflar;

public class CompositionTest {

	public static void main(String[] args) {
		Ev daire = new Ev("Daire");
		daire.odalar[0] = new Oda("Salon");

	}

}
class Ev{
	String isim;
	Oda[] odalar;
	Ev(String isim){
		this.isim = isim;
		odalar = new Oda[4];
	}
}
class Oda{
	String isim;
	Oda(String isim){
		this.isim = isim;
	}
}