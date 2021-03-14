package com.corejava.HataAyiklama;

public class ExceptionsTest1 {

	public static void main(String[] args) {
		try {
			int[] sayılar = {23, 54, 1, 33};
			int i = sayılar[4];
		}catch(IndexOutOfBoundsException i) {
			System.out.println("Exception nesnesini açıklar: " + i.getMessage());
			System.out.println("Exception nesnesini açıklar: " + i.toString());
			i.printStackTrace();
			
		}finally {
			System.out.println("finally Exception fırlatılsın ya da fırlatılmasın hep çağırılır...");
		}

	}

}
