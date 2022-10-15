package javay1;

public class javaOndokuz {

	public static void main(String[] args) {
		int[] sayilar =new int[] {1,2,5,7,8,9};
		int aranacak=5;
		boolean varMİ=false ;
		
		for (int sayi : sayilar ) {
			if (sayi== aranacak) {
				varMİ = true;
				break;
			}
		}
		if(varMİ) {
			System.out.println("sayı mevcuttur");
		}else {
			System.out.println("sayı yoktur");
		}
		

	}

}
