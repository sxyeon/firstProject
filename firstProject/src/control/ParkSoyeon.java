package control;

import java.util.Scanner;

public class ParkSoyeon {

	public static void main(String[] args) {

		// if for(while) break, continue

		Scanner scn = new Scanner(System.in);
		int a = (int) (Math.random() * 10);
		int i = 0;

		do {
			System.out.println("숫자를 입력하세요");
			i = scn.nextInt();
			if (a <= 30) {
				continue;
			}
			System.out.println("다시");
			if (a > 30) {
				break;
			}
		} while (true);
		System.out.println("끝");

	}

}
