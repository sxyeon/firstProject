package reference;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 1 ~ 10���� ������ ���� ����.
		// �л� 10��.
		int[] scores = new int[10]; // 0, 0, 0, 0, 0, 0, 0, 0
		System.out.println(scores.length);
		for (int i = 0; i < scores.length; i++) {
			int temp = (int) (Math.random() * 10) + 1; // �л�
			scores[i] = temp;
		}
		
		// ���
		for (int i = 0, l = scores.length; i < l; i++) {
			System.out.printf("scores[%d] => %d\n", i, scores[i]);
		}
		System.out.println("��.");
		
		// �迭�� ����ִ� ��ҵ��� ��.
		int sum = 0;
		// �迭�� �հ�: 55
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("�迭�� �հ�: " + sum);
		System.out.println("��2.");
		
		// �迭�� ��� �� 5���� ū ���� �հ�
		// if ���
		sum = 0;
		for (int i=0;
			
		}
		
		System.out.println("��3.");
		
		// �迭 ��� �� ¦����° ���� �հ�
		System.out.println("��4.");
		
	}

}
