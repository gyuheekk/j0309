package t4_0309;

import java.util.Scanner;

public class BunsikRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int sw = 0;
		
		BunsikService service = new BunsikService();
		Bonsa wangjaBunsik = new WangjaBunsik();
		Bonsa woojuBunsik = new WoojuBunsik();
		Bonsa seoulBunsik = new SeoulBunsik();
		
		while(true) {
			System.out.println("======================================================");
			System.out.println("\t\t분식집을 선택해주세요?");
			System.out.println("\t1. 왕자분식 2. 우주분식 3. 서울분식 4. 종료");
			System.out.print("=================================================>>> ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					wangjaBunsik.menuPrice();
					service.Price(wangjaBunsik);
					break;
					
				case 2:
					woojuBunsik.menuPrice();
					service.Price(woojuBunsik);
					break;
					
				case 3:
					seoulBunsik.menuPrice();
					service.Price(seoulBunsik);
					break;
					
				case 4:
					System.out.println("종료합니다.");
					sw = 1;
					break;
			}
			if(sw == 1) break;
		}
		
		sc.close();
	}
}