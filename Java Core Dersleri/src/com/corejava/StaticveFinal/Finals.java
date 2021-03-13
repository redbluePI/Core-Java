package com.corejava.StaticveFinal;

public class Finals{

	public static void main(String[] args) {
		
		DAO.yazdir();
		System.out.println(".....................................................");
		Araba a1 = new Araba();
		a1.kartNumarası();
		System.out.println(".....................................................");
		//a1.PI = 3; değeri değiştirelemez.
		System.out.println(a1.PI);
	}

}

final class DAO{
	static int i;
	
	static void yazdir() {
		System.out.println("yazdir çağırıldı.....");
	}
}

class Araç{
	final void kartNumarası() {
		System.out.println("Kart no: 9");
	}
	
}
class Araba extends Araç{
	public final double PI;
	public Araba() {
		this.PI = 3.1415;
		
	}
}