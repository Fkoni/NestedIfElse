package day10_Ternary_SwitchCase;

import java.util.Scanner;

public class C01_Ternary {

	public static void main(String[] args) {
		// kullanicidan iki sayi alin ve buyuk olmayani yazdirin

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz giriniz");
		double sayi1= scan.nextInt();
		
		System.out.println("Lutfen bir sayi daha giriniz giriniz");
		double sayi2= scan.nextInt();
		
		System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
		
		scan.close();
		
	}

}
