package javay1;

public class javaOnbir {

	public static void main(String[] args) {
		double [] mylist= {1.2,1.8,2.9};
		double total= 0;
		double max = mylist[0];
		for ( double number : mylist) {
			if(max<number) {
				max=number;
			}
			total=total+number;
			System.out.println(number);
		}
		System.out.println("Toplam="+total);
		System.out.println("en büyük="+max);
		

	}

}
