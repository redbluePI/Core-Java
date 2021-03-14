package com.corejava.HataAyiklama;

import java.util.Scanner;

public class ExceptionsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		
		System.out.println(i1/i2); // 21/0 => java.lang.ArithmeticException: / by zero

/*
 * if(i2 == 0){
 * 		print(" 0'a bölünme hatası");
 * }else{
 * 		print(i1/i2);
 * }
 */
		System.out.println("............................................");
		try {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			System.out.println(n1/n2);
		}catch(ArithmeticException ae) {
			System.out.println("ArithmeticException: 0'a bölünemez...");
		}
		System.out.println("Devam....");
		System.out.println("............................................");
		boolean devamMI = true;
		int sonuç = 0;
		while(devamMI) {
			try {
				int m1 = sc.nextInt();
				int m2 = sc.nextInt();
				
				sonuç = m1/m2;
				devamMI = false;
			}catch(ArithmeticException ae) {
				System.out.println("ArithmeticException: 0'a bölünemez...");
				sc.nextLine();
			}
		}
		System.out.println("Sonuç: " + sonuç);
		
	}

}
