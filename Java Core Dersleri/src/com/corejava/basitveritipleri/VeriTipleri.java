package com.corejava.basitveritipleri;

import java.util.Scanner;

public class VeriTipleri {

	public static void main(String[] args) {
		boolean b = true;
		System.out.println("boolean tip: b = " + b);
		
		
		char c1 = '\u0000';
		char c2 = '\uffff';
		char c3 = 'c';
		char c4 = 65;	
		System.out.println("char tipi: " + "c1:" + c1 + " c2:" + c2 + " c3:" + c3 + " c4:" + c4);
		
		
		byte b1;
		b1 = 127;
		b1++;
		System.out.println("byte tip: b1 = " + b1);
		
		
		short s = 32767;
		s++;
		System.out.println("short tip: s = " + s);
		
		
		int i1 = Integer.MIN_VALUE;
		int i2 = Integer.MAX_VALUE;
		System.out.println("min integer: i1 = " + i1 + " max integer: i2 = " + i2);
		i2++;
		System.out.println(i2);
		int hex = 0x2a;
		System.out.println("hex degerin karsiligi: " + hex);
		int binary = 0b0101;
		System.out.println("binary degerin onluk sistemdeki karsiligi: " + binary);
		
		
		long l1 = -123456789l;
		System.out.println("long tip: l1 = " + l1);
		
		
		double d1 = 232.424;
		System.out.println("double tip: d1 = " + d1);
		double d2 = 0.00031415e4;
		System.out.println("double tipin bilimsel yazim sekli: " + d2);
		
		
		float f1 = 3.1415f;
		System.out.println("float tip: f = " + f1);
		
		
		//alttan cizgi
		byte b2 = 0b1010_10;
		int i3 = 3_323_000;
		long l2 = 1_000_000_000_000l;
		long l3 = 1_00_00_00_00_00_00l;
		long long_hex = 0x1_0A;
		long l4 = 0b11_011_0111l;
		float f2 = 3.14_15f;
		System.out.println("Altcizginin kullanimi: \n" + "b2:" + b2 + " i3:" + i3 + " l2:" + l2 + " l3:" + l3 + " long_hex:" + long_hex + " l4:" + l4 + " f2:" + f2);
		

		//tip dönüsümleri
		//genisleyen (otomatik)
		int i4 = 98;
		long l5 = i4;
		System.out.println("l5 = " + l5);
		double d3 = i4;
		System.out.println("d3 = " + d3);
		long l6 = Long.MAX_VALUE;
		float f4 = l6;
		System.out.println("l6=" + l6 + " f4=" + f4);
		
		//daralan (manuel)
		int i5 = (int)d3;
		System.out.println("i5 = " + i5);
		float f3 = (float)d3;
		System.out.println("f3 = " + f3);

		
		
		int i6 = c3;
		System.out.println(i6);
//-----------------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bir sayi giriniz:");
//        String s = scanner.nextLine();
//
//
//            try{
//                long l = Long.parseLong(s);
//                System.out.println(s + " sayisi bu veri tipinde olabilir:");
//
//                if(l <= 127 && l >= -128){
//                    System.out.println("byte, short, int, long");
//                }else if( l <= 32767 && l >= -32768){
//                    System.out.println("* short, int, long");
//                }else if ( l <= 2147483647 && l >= -2147483648){
//                    System.out.println("* int, long");
//                }else if(l <= 9223372036854775807l && l >= -9223372036854775808l){
//                    System.out.println("long");
//                }
//
//            }catch (NumberFormatException e){
//                System.out.println(s + " sayisi herhangi bir veri tipine uymuyor...");
//            }


	}

}
