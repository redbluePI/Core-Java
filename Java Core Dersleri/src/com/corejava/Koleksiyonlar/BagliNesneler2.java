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
		System.out.println("...............................................................................");
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(34, "Istanbul");
		h1.put(06, "Ankara");
		h1.put(16, "Bursa");
		h1.put(58, "Sivas");
		h1.put(16, "Bursa");
		System.out.println(h1);
		h1.remove(16);
		System.out.println(h1);
		for(String i : h1.values()) {
			System.out.println(i);
		}
		for(Map.Entry<Integer, String> e : h1.entrySet()) {
			System.out.println(e.getValue());
		}
		System.out.println("...............................................................................");
		HashMap<Integer, Bina> binalar = new HashMap<Integer, Bina>();
		binalar.put(321, new Bina("Yıldız", 321));
		binalar.put(541, new Bina("Yıldız", 541));
		System.out.println(binalar);
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