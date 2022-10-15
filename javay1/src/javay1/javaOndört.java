package javay1;

public class javaOndört {

	public static void main(String[] args) {
		int number= 1;
		boolean inPrime= true;
		if(number<1) {
			System.out.println("geçerli sayı değildir");
		}
		if(number==1) {
			System.out.println("sayı asal değilir ");
			return;
		}
			
		for(int i=2;i<number;i++) {
			if(number%i==1) {
				inPrime= false;
				
			
			}	
		}
		if (inPrime) {
			System.out.println("asal sayı değilidir");
		}else {System.out.println("asal sayıdır");

		}

		
}
}