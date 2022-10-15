package javay1;

public class javaOniki {

	public static void main(String[] args) {
		String[] [] sehırler = new String[3][3];
		
		sehırler[0][0]="İstanbul";		
		sehırler[0][1]="yozgat";
		sehırler[0][2]="sakarya";
		sehırler[1][0]="erzurum";
	   sehırler[1][1]="ankara";
	sehırler[1][2]="adana";
								 sehırler[2][0]="konya";
										sehırler[2][1]="sivas";
												sehırler[2][2]="muş";
												for (int i =0; i<=2;i++) {
													System.out.println("...............");
													for(int j=0;j<=2;j++) {
														System.out.println(sehırler[i][j]);
													}
												}
												
				
	}

}
