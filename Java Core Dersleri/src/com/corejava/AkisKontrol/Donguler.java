package com.corejava.AkisKontrol;

public class Donguler {

	public static void main(String[] args) {
//while
		int i = 0;
		
		while(i < 3) {
			System.out.println("i: " + i);
			i++;
		}
		
		System.out.println("Birinci döngü bitti...");

//		while(true) {
//			System.out.println("i: " + i);
//			i++;
//			if(i == 4) return;
//		}
		
		

//do while
		
		System.out.println("do-while döngüsü basliyor...");		
		i = 1;
		do {
			System.out.println("i: " + i);
			i++;
		}
		while(i < 0);
		
//for
		System.out.println("for döngüsü basliyor...");
		
		for(int j = 0; j < 5; j++) {
			System.out.println("j: " + j);
		}
		
//		int i2 = 41;
//		for(int k = i2; ;) {
//			k = k - 7;
//			if(k < 7) {
//				System.out.print(i2 + "nin 7ye bölümünden kalan:" + k);
//				return;
//			}
//		}
		int i3 = 0;
		for(int l = 0;l<10;l++) {
			for(int m = 0; m<10; m++) {
				System.out.print(i3);
				System.out.print("  ");
				i3++;
			}
			System.out.println();
		}
		
	}
}
