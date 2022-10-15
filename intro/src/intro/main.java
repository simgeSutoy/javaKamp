package intro;

public class main {

	public static void main(String[] args) {
		System.out.println("Hello WORLD!");
		
		// javada değişken isimleri camelCase yazılır ve metin sonu kesin ; olmalı
		String ortaMetin = "ilginizi çekebilir" ;
		String altMetin = " vade süresi" ;
		
		System.out.println(ortaMetin);
		
		// int integer tam sayı değişkeni
		int vade = 12 ; 
		
		double  dolarDun = 18.25;
		double  dolarBugun= 18.20 ;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {//true
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		} else if  (dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
			
		} 
		else {
			okYonu = "equal.svg";
		System.out.println(okYonu);
	
		}
		// listeli veriler soyle tutulur 
		//array koseli parantez gorurusen liste demek 
		String[] krediler = {"Hızlı kredi","maaşını halkbanktan alan","mutlu kerdi"}	;
		
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
			
			
		}
		
		
	}


}
