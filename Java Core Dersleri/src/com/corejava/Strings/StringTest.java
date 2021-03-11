package com.corejava.Strings;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "Merhaba";
		String s2 = new String("Dünya");
		System.out.println(s1 + " " + s2);
		System.out.println(".......................................................................");
		System.out.println(s1.concat(s2));
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println("dünya " + s2.length() + " harfli bir kelimedir.");
		System.out.println(".......................................................................");
		String s3 = "Java dili güvenli ve basit bir dildir.";
		System.out.println(s3.indexOf('a'));
		System.out.println(s3.indexOf("güvenli"));
		System.out.println(s3.substring(5, 9));
		System.out.println(".......................................................................");
		String isim = "Ahmet      ";
		System.out.println(isim.trim() + " Bey,");
		System.out.println(isim.replace('t', 'd'));
		System.out.println(isim.contains("met"));
		System.out.println(".......................................................................");
		isim = isim.trim();
		String soyad = "Mehmet";
		System.out.println(String.format("Selam %s %S %nnumaram %s ", isim, soyad, 424232));//Integer
		System.out.printf("Selam %s %S %nnumaram %s ", isim, soyad, 424232);
		System.out.println();
		int i1 = 100000000;
		System.out.println(String.format("Fatura: %,d TL", i1));
		int i2 = 123;
		System.out.println(String.format("Fatura: %10d TL", i2));
		
		
		System.out.println(".......................................................................");
//özel karakterler		
		String s4 = "Türkiye'de \"havalar\" iyi.";
		System.out.println(s4);
		String s5 = "Buraya \\ ters slash gelecek.";
		System.out.println(s5);
		String s6 = "Hersey \'güzel\' olacak.";
		System.out.println(s6);
		String s7 = "Ahmet: \ndamlaya damlaya göl olur mu?";
		System.out.println(s7);
		String s8 = "\tParagraf burdan basliyor.";
		System.out.println(s8);

		
	}

}
