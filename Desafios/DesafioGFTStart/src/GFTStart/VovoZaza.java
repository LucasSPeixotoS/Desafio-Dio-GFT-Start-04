package GFTStart;

import java.util.Scanner;

public class VovoZaza {

	public static void main(String[] args) {
		
		/* A valor antigo e B novo valor*/
		
		Scanner leitor = new Scanner(System.in);
		
		
    	double A = leitor.nextDouble();
    	double B = leitor.nextDouble();
    	double totalAumento;
    	
    	totalAumento = ((((B - A) * 100.00)/ A));
    	//System.out.println((totalAumento + 0.00) + "0%");
    	//BigDecimal b = new BigDecimal(totalAumento).setScale(2, RoundingMode.);
    	//System.out.println(b.doubleValue()+"%");
    	//System.out.format("%.2f%", totalAumento);
    	System.out.printf("%.2f%%", totalAumento);// %.2f%% para mostrar dois numeros apos a virgula caso n tenha ele acrescenta
		leitor.close();
	}
	
}
