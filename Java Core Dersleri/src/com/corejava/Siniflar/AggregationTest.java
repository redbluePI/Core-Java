package com.corejava.Siniflar;

public class AggregationTest {

	public static void main(String[] args) {
		
		Bolum dahiliye = new Bolum("Dahiliye", 10);
		dahiliye.profesorler[0] = new Profesor("Ahmet");
		dahiliye.profesorler[1] = new Profesor("Mehmet");
		System.out.println(dahiliye.profesorler[0].isim);
		System.out.println(dahiliye.profesorler[1].isim);
	}

}
class Bolum{
	String isim;
	Profesor[] profesorler;
	Bolum(String isim, int n){
		this.isim = isim;
		profesorler = new Profesor[n];
	}
}
class Profesor{
	String isim;
	Profesor(String isim){
		this.isim = isim;
	}
}