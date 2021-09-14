package firstProject;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("영어점수를 입력하세요");
		int num1 = scn.nextInt();
		System.out.println("수학점수를 입력하세요");
		int num2 = scn.nextInt();
		System.out.println("이름을 입력하세요");
		String name = scn.nextLine();
		
		System.out.printf("%s님의 영어, 수학점수의 합은 %d입니다.", name, num1+num2);
		
		
	}

}
