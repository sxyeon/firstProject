package firstProject;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���������� �Է��ϼ���");
		int num1 = scn.nextInt();
		System.out.println("���������� �Է��ϼ���");
		int num2 = scn.nextInt();
		System.out.println("�̸��� �Է��ϼ���");
		String name = scn.nextLine();
		
		System.out.printf("%s���� ����, ���������� ���� %d�Դϴ�.", name, num1+num2);
		
		
	}

}
