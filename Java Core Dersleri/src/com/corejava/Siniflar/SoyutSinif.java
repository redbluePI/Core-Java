package com.corejava.Siniflar;

public class SoyutSinif extends Hayvan{

	public static void main(String[] args) {
		Hayvan aslan = new SoyutSinif();
		aslan.Yürüme();
		aslan.Yemek();

	}

	@Override
	public void Yemek() {
		System.out.println("yemek yiyor...");
		
	}

}
abstract class Hayvan{
	public abstract void Yemek();
	public void Yürüme() {
		System.out.println("yürüyor...");
	}
}
