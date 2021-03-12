package com.corejava.Siniflar;

public class YapiciMetotTest {

	public static void main(String[] args) {
		GUI Arayüz = new GUI("asd");
		
	}

}

class GUI{
	String isim;
	int id;
	GUI(){
		System.out.println("GUI yapici metodu calisti.");
		yaz();
	}

	GUI(String isim){
		this.isim = isim;
		System.out.println(isim + "-GUI yapici metodu calisti.");
	}
	GUI(String isim, int id){
		this.isim = isim;
		this.id = id;
		System.out.println(this.isim + " " + this.id + "-GUI yapici metodu calisti.");
	}
	void yaz() {
		System.out.println("yaz metodu cagirildi.");
	}
}