package javay1;

public class javaOnikiS {

	public static void main(String[] args) {
  	String mesaj ="  Bugün hava çok güzel   ";
//		System.out.println(mesaj);
//		System.out.println("eleman sayısı=" +mesaj.length());
//		System.out.println("5. eleman="+mesaj.charAt(7));
//		System.out.println(mesaj.concat("yayyy!"));
//		System.out.println(mesaj.startsWith("c"));
//		System.out.println(mesaj.startsWith("B"));
//		System.out.println(mesaj.endsWith("."));
//		char[] karakterler =new char [5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf("a"));
//		System.out.println(mesaj.lastIndexOf("a"));
//		System.out.println(mesaj.lastIndexOf("l"));
    System.out.println(mesaj.replace("a", "e"));
System.out.println(mesaj);
	String yeniMesaj = mesaj.replace("a", " ");
	System.out.println(yeniMesaj);
	System.out.println(mesaj.substring(7));
  	System.out.println(mesaj.substring(3,7));
  	for (String kelime : mesaj.split(" ")) {
  		System.out.println(kelime);
  	}
  	System.out.println(mesaj.toLowerCase());
  	System.out.println(mesaj.toUpperCase());
  	System.out.println(mesaj.trim());
  	
  	}
  	
			

	}


