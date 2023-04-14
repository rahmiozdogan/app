package ders2;

import java.util.Scanner;

public class ders2 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	
		System.out.println("1: Bakiye Görüntüle");
		System.out.println("2: Para Çekme");
		System.out.println("3: Para eklemee");
		System.out.println("4: sistemden çıkış");
		
		int bakiye = 1000;
		int islem = scan.nextInt();
		
		switch(islem) {
		case 1:
			System.out.println("bakiyeniz:" + bakiye + "tl dir "); 
			break;
		case 2:
			System.out.println("ne kadar yatıracaksın?");
			int mikta r = scan.nextInt();
			bakiye = bakiye + miktar;
			System.out.println("bakiyeniz : " + bakiye + "tl dir");
			break;
		case 3:
			
			System.out.println("ne kadar çekeceksiniz");
			int miktar1 = scan.nextInt();
			int value = bakiye - miktar1;
			System.out.println("kalan bakiye" + value + "dir");
			
			break;
		case 4:
			System.out.println("sistemden çıkıs");
			break;
		
		default:
			System.out.println("geçersiz işlem ");
		
		
		
		
		
		
		
		}
	}
	
	
	
	
}
































