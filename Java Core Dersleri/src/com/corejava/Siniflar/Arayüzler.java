package com.corejava.Siniflar;

public class Arayüzler {

	public static void main(String[] args) { 
		IKalem ik = new DolmaKalem();
		ik.yazıYaz();

	}

}
interface IKalem{
	//public, abstract
	void yazıYaz();
	//public static final
	static final int i = 3;
}
interface IÇizilebilir{
	
}
class DolmaKalem extends KursunKalem implements IKalem, IÇizilebilir{

	@Override
	public void yazıYaz() {
		System.out.print("Dolmakalem yazıyor.....");
		System.out.print(i);
	}

}
class KursunKalem{
	
}