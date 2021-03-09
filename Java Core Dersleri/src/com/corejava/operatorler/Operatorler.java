package com.corejava.operatorler;

public class Operatorler {

	public static void main(String[] args) {
		//aritmetik
		int i1 = 2 + 5;
		System.out.println("2 + 5 = " + i1);

		i1 = i1 - 1;
		System.out.println("7 - 1 = " + i1);
		
		i1 = i1 * 2;
		System.out.println("6 * 2 = " + i1);
		
		i1 = i1 / 3;
		System.out.println("12 / 3 = " + i1);
		
		i1 = i1 % 3;
		System.out.println("4 mod 3 = " + i1);
		
		i1++;
		System.out.println("1 + 1 = " + i1);
		--i1;
		System.out.println("2 - 1 = " + i1);
		int i2 = 3;
		System.out.println(i2++); //!!!
		System.out.println(++i2);
		
		//kiyaslamali
		double d1 = 3.14;
		double d2 = 3.1415;
		System.out.println("d1 == d2 :" + (d1 == d2));
		System.out.println("d1 != d2 :" + (d1 != d2));
		System.out.println("d1 < d2 :" + (d1 < d2));
		System.out.println("d1 > d2 :" + (d1 > d2));
		System.out.println("d1 =< d2 :" + (d1 <= d2));
		System.out.println("d1 => d2 :" + (d1 >= d2));
		
		System.out.println("true && true :" + (true && true));
		System.out.println("true && false :" + (true && false));
		System.out.println("!true :" + (!true));
		
		
		//bit islemleri
		int i3 = 0b0101;
		int i4 = 0b1011;
		System.out.println("i3 & i4 :" + (i3 & i4));
		System.out.println("i3 | i4 :" + (i3 | i4));
		System.out.println("i3 ^ i4 :" + (i3 ^ i4));
		System.out.println("~01: " + ~(1));
		System.out.println("i3<<1 :" + (i3<<1));
		System.out.println("i3>>1 :" + (i3>>1));
		System.out.println("i3>>>1 :" + (i3>>>2));
		
		//atama operatörleri
		short s = 435;
		s += 1;
		System.out.println("435 + 1 = " + s);
		s -= 1;
		System.out.println("436 - 1 = " + s);
		s *= 2;
		System.out.println("435 * 2 = " + s);
		s /= 10;
		System.out.println("870 / 10 = " + s);
		
		
		// diger operatörler
		System.out.println((5<3 ? true : false));
		String s1 = "Selam";
		System.out.println("s1 bir String nesnesi mi? " + (s1 instanceof String));
	}

}
