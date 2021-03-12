package com.corejava.Siniflar;

public class ThisTest {

	public static void main(String[] args) {
		
		Kisi k1 = new Kisi();
		k1.setId(232);
		k1.setIsim("Ahmet");
	}

}
class Kisi{
	private String isim;
	private int id;

	Kisi(String isim, int id){
		this.isim = isim;
		this.id = id;
	}
	
	Kisi(){
		
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}