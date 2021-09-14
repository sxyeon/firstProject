package firstProject;

import java.util.Scanner;

public class ParkSoyeon {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("영화명을 입력하세요");
		String movie = scn.nextLine();
		System.out.println("상영관을 입력하세요");
		String theater = scn.nextLine();
		System.out.println("예매번호를 입력하세요");
		int num = scn.nextInt();
		
		System.out.printf("영화명:%s, 상영관:%s, 예매번호:%d\n", movie, theater, num);
	
		

	}

}
