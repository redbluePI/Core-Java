package com.corejava.Koleksiyonlar;

import java.util.*;


public class BagliNesneler1 {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("Istanbul");
		liste.add("Ankara");
		System.out.println(liste);
		System.out.println("...............................................................................");
		System.out.println("Eleman sayısı: " + liste.size());
		liste.remove(0);
		System.out.println("Eleman sayısı: " + liste.size());
		System.out.println("...............................................................................");
		liste.add("Istanbul");
		liste.add("Izmir");
		liste.add(0, "Bursa");
		System.out.println(liste);
		System.out.println("Eleman sayısı: " + liste.size());
		System.out.println("...............................................................................");
		for(int i=0;i<liste.size();i++) {
			System.out.print(liste.get(i) + " ");
		}
		System.out.println();
		for(String s : liste) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("...............................................................................");
		ListIterator<String> iterator = liste.listIterator(0);
		do {
			System.out.print(iterator.next() + " ");
		}while(iterator.hasNext());
		System.out.println();
		System.out.println("...............................................................................");
		System.out.println(liste.contains("Istanbul1"));
		System.out.println("Izmir: " + liste.indexOf("Izmir"));
		liste.set(0, "Antalya");
		System.out.println(liste);
		System.out.println("...............................................................................");
		ArrayList<Integer> kutular = new ArrayList<Integer>();
		kutular.add(33);
		kutular.add(98);
		System.out.println("kutular: " +kutular);
		ArrayList<Integer> kutular1 = new ArrayList<Integer>();
		kutular1.add(65);
		kutular1.add(82);
		System.out.println("kutular1: " +kutular1);
		kutular.addAll(kutular1);
		System.out.println("kutular: " + kutular);
		Collections.sort(kutular);
		System.out.println("sıralı kutular: " + kutular);
	}

}
