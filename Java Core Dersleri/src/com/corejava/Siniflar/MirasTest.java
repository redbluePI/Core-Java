package com.corejava.Siniflar;

public class MirasTest {

	public static void main(String[] args) {
		SubClass SC = new SubClass();
		SC.getInfo();
		System.out.println("---------------------------------------------------------------");
//super ve override		
		Kivi k1 = new Kivi("Kivi 1");
		k1.yenebilir();
		System.out.print(k1);
	}

}
class Meyve{
	String isim;
	public Meyve(String isim) {
		this.isim = isim;
		System.out.println("Meyve çağrıldı...");
	}
	protected void yenebilir(){
		System.out.println("Bu meyve yenebilir...");
	}
}
class Kivi extends Meyve{

	public Kivi(String isim) {
		super(isim);
		super.yenebilir();
	}
	
	@Override
	protected void yenebilir() {
		System.out.println("Bu Kivi yenebilir...");
	}
	
	@Override
	public String toString() {
		return "Bu meyvenin ismi: " + isim;
	}
}
class Çilek extends Meyve{

	public Çilek(String isim) {
		super(isim);
	}
	
}
class SuperClass{
	protected double d = 3.1415;
	public SuperClass() {
		// TODO Auto-generated constructor stub
	}
	void getInfo() {
		System.out.println(d);
	}
}
class SubClass extends SuperClass{

}
