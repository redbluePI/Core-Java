package com.corejava.Koleksiyonlar;

import java.util.*;

public class BagliNesneler2 {

	public static void main(String[] args) {
		List<Bina> sokak = new ArrayList<Bina>();
		sokak.add(new Bina("Yıldız", 35));
		sokak.add(new Bina("Deniz", 45));
		sokak.add(new Bina("Adalar", 12));
		Collections.sort(sokak, Comparator.comparing(Bina::getNo));
		
		System.out.println(sokak);
		
	}

}
class Bina{
	String isim;
	int no;
	public Bina(String isim, int no) {
		this.isim = isim;
		this.no = no;
	}
	public String getIsim() {
		return isim;
	}
	public int getNo() {
		return no;
	}
	@Override
	public String toString() {
		return " isim: " + this.isim + " no: " + this.no + "\n";
	}
}