package firstProject;

import java.util.Scanner;

public class ParkSoyeon {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("��ȭ���� �Է��ϼ���");
		String movie = scn.nextLine();
		System.out.println("�󿵰��� �Է��ϼ���");
		String theater = scn.nextLine();
		System.out.println("���Ź�ȣ�� �Է��ϼ���");
		int num = scn.nextInt();
		
		System.out.printf("��ȭ��:%s, �󿵰�:%s, ���Ź�ȣ:%d\n", movie, theater, num);
	
		

	}

}
