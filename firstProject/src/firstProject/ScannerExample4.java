package firstProject;

import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {
		// "100" vs. 100
		int num1 = 100;
		String num2 = "100";
		
		int num2Int = Integer.parseInt(num2);   //int -> Integer
		
		String num3 = "12.25";
		double num3Double = Double.parseDouble(num3);
		
		int result = num1 + num2Int;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("�̸��� �Է�>>> ");
		String name = scn.nextLine();
		System.out.println("���̸� �Է�>>> ");
		String age = scn.nextLine();
		if(age.equals("")) {
			age = "0";
		}
		int ageInt = Integer.parseInt(age);
		System.out.println("����ó�� �Է�>>> ");
		String phone = scn.nextLine();
		
		System.out.println("[�Է��� ����]");
		System.out.printf("�̸�:%s\t����:%d\t����ó:%s\n", name, ageInt, phone);
		System.out.println("��. ");

	}

}
