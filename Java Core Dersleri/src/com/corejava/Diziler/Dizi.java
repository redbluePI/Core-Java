package com.corejava.Diziler;

import java.util.Arrays;

public class Dizi {

	public static void main(String[] args) {
		int[] sayilar = { 30, 98, 2};
		int[] sayilar1 = new int[3];
		sayilar1[0] = 30;
		sayilar1[1] = 98;
		sayilar1[2] = 2;
		
//		System.out.println(sayilar[0]);
//		System.out.println(sayilar[1]);
//		System.out.println(sayilar[2]);
		for(int i = 0; i<sayilar.length; i++) {
			System.out.print(sayilar[i]);
			System.out.print(" ");
		}
		for(int i : sayilar) { //i = sayilar[0] ......
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		
		char[] karakterler = {'a', 'b', 'c', 'd', 'e'};
		System.out.println("ilk eleman: " + karakterler[0]);
		System.out.println("son eleman: " + karakterler[karakterler.length - 1]);
		
		System.out.println("Ilk eleman ve son eleman yer degistiriyor.....");

		char temp = karakterler[0];
		karakterler[0] = karakterler[karakterler.length - 1]; // {'e', 'b', 'c', 'd', 'e'}
		karakterler[karakterler.length - 1] = temp;
		System.out.println("ilk eleman: " + karakterler[0]);
		System.out.println("son eleman: " + karakterler[karakterler.length - 1]);
		System.out.println("----------------------------------------------------");
		
		boolean[] b1 = {true, false, false, true, true };
		for(boolean b : b1) {
			System.out.print(b);
			System.out.print(" ");
		}
		System.out.println();
		
		boolean[] b2 = b1;
		for(boolean b : b2) {
			System.out.print(b);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		
		Arrays.sort(sayilar);
		for(int i = 0; i<sayilar.length; i++) {
			System.out.print(sayilar[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		
		int[][] matris = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(matris[1][0]);
		for(int i=0; i<matris.length;i++) {
			for(int j=0; j<matris[0].length; j++) {
				System.out.print(matris[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
