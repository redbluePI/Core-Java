package com.corejava.StaticveFinal;

public class Statics {

	public static void main(String[] args) {
		Kullanıcı k1 = new Kullanıcı("Ahmet", 432);
		Kullanıcı k2 = new Kullanıcı("Mehmet", 432);
		System.out.println(k1.toString());
		System.out.println(k2.toString());
		System.out.println("--------------------------------------------------------------------");
		
		Sayaç s1 = new Sayaç();
		System.out.println("--------------------------------------------------------------------");
		Sayaç s2 = new Sayaç();
		System.out.println("--------------------------------------------------------------------");
		Sayaç s3 = new Sayaç();
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println(Sayaç.getSayaç());
		
	}

}
class Kullanıcı{
	String isim;
	int id;
	static String bağlantıTürü = "Web Tarayıcısı";
	
	public Kullanıcı(String isim, int id) {
		this.isim = isim;
		this.id = id;
	}
	@Override
	public String toString() {
		return "isim: " + this.isim + " id: " + this.id + " Bağlantı: " + Kullanıcı.bağlantıTürü;
	}
}
class Sayaç{
	static int sayaç;
	
	static {
		sayaç = 0;
	}
	{
		System.out.println("blok çağırıldı...");
	}
	public Sayaç() {
		sayaç++;
		System.out.println("Sayaç: " + sayaç);
	}
	
	public static int getSayaç() {
		return sayaç;
	}
}