package com.corejava.HataAyiklama;

import java.io.IOException;

public class ExceptionsTest2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ExceptionsTest2 e = new ExceptionsTest2();
		e.yazdır();
		throw new ClassNotFoundException("Sınıf bulunamadı");
	}

	void yazdır() throws IOException{
		System.out.println("yazdır metodu çağırıldı...");
	}
}
