package com.corejava.AkisKontrol;

public class IfKosulu {

	public static void main(String[] args) {

//Kosul operatörleri: <, >, <=, >=, ==, !=
//true, false
		int a = 4;
		if(a == 3)
			System.out.println("a = " + a);
		System.out.println("a = " + a);
		if(a > 0) {
			System.out.println("a > 0");
		}else {
			System.out.println("a < 0");
		}
		
		boolean b = false;
		if(b) {
			System.out.println("b: " + b);
		}else {
			System.out.println("b:" + b);
		}
		
		byte saat = 13;
		if( (saat > 12) || (saat < 13)) {
			System.out.println("Öglen...");
		}else if((saat < 12) && (saat > 6)) {
			System.out.println("Sabah...");
		}else {
			System.out.println("Aksam...");
		}
		
		String meyve = "Elma";
		if(meyve.equals("Elma")) {
			System.out.println("ELma yiyebilirsin... ");
		}else {
			System.out.println("Armut yiyebilirsin... ");
		}
		
		String isim = "Ahmet";
		String sifre = "12345";
		if((isim.equals("Ahmet")) && (sifre.equals("12345"))) {
			System.out.println("Hosgeldin " + isim);
		}else {
			System.out.println("Isim ya da sifre yanlis...");
		}
		
//Switch 
		int i1 = 2;
		if(i1 == 1) {
			System.out.println("Pazartesi");
		}else if(i1 == 2) {
			System.out.println("Sali");
		}else if(i1 == 3) {
			System.out.println("Carsamba");
		}else if(i1 == 4) {
			System.out.println("Persembe");
		}
		i1 = 7;
		switch(i1) {
			case 1:
				System.out.println("Pazartesi");
				break;
			case 2:
				System.out.println("Sali");
				break;
			case 3:
				System.out.println("Carsamba");
				break;
			case 4:
				System.out.println("Persembe");
				break;
			case 5:
				System.out.println("Cuma");
				break;
			default:
				System.out.println("Haftasonu");
				break;
		}
		
	}

}
