package reference;

public class EnhanceForExample {

	public static void main(String[] args) {
		String[] strAry = null;
		strAry = new String[5]; // ���� �� ��Ҵµ� ũ�⸸ �ټ� ���� �Ҵ����� | null, null, null, null, null (�ʱⰪ���� �ΰ��� ������)
		strAry = new String[] {"Hong","Park","Choi","Kim","Hwang"};
		System.out.println(strAry.length);
		
		strAry[2] = "Hong"; // intŸ���� ==, ���ڴ� equals()
		
		for(int i=0; i<strAry.length; i++) {
			if(strAry[i].equals("Hong"))
			System.out.println(strAry[i]);
		}
		System.out.println("====�ٽ�====");
		
		// Enhanced for
		for(String name : strAry) {
			System.out.println(name);
		}
		
		int[] scores = {50, 70, 80, 60};
		int sum = 0;
		for(int score : scores) { // �޾ƾ� �� Ÿ���� int��� ���� �˷��ִ� ��
			sum += score;
		}
		
		// �л� 3��. 4.2, 3.5, 2.8 �迭 ���� (doubleŸ�� ���)
		// �հ� ���� �� �ֵ��� ����
		// ����� ����ؼ� avg
		// �л����: 3.xx�Դϴ�. ���
		double[] score = {4.2,3.5,2.8}
		double  avg

	}

}
