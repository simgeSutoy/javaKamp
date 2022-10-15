package javay1;

public class methods {

	public static void main(String[] args) {
		sayıBulmaca();
		sayıBulmaca();
		sayıBulmaca();

	}

	public static void sayıBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 8, 9 };
		int aranacak = 5;
		boolean varMİ = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMİ = true;
				break;
			}
		}
		String mesaj = "";
		if (varMİ) {

			mesaj = "sayı mevcuttur:" + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("sayı yoktur" + aranacak);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}

}
