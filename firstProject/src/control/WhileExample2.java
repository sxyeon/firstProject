package control;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String age = "20";
		String phone = "010-0000-0000";
		
		// ������� �Է��� �޾Ƽ� �Է��� ���� �о �ű� ���� �ٸ� ������ �����ִ� ��
		// ������� Scanner ���.
		// 1 => �̸�, 2 => ����, 3 => ����ó 4 => �ݺ�������.
		Scanner scn = new Scanner(System.in);
		while(true) { 
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1.�̸� 2.���� 3.����ó 4.����");
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.println("�̸�: " + name);
			} else if (menu == 2) {
				System.out.println("����: " + age);
			} else if (menu ==3 ) {
				System.out.println("����ó: " + phone);
			} else if (menu == 4) {
				break;
			}
		}
		System.out.println("��.");
	}

}
