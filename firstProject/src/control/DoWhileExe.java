package control;

public class DoWhileExe {
	public static void main(String[] args) {
		boolean run = false;

		// 1���� 10���� ���
		// ��1.

		int cnt = 0;
		

		do {
			cnt++;
			if (cnt > 10) {
				break;

			}
			System.out.println(cnt);
		} while (true);

		System.out.println("��1.");

		// ¦���� ���

		cnt = 0;
		
		do {
			cnt++;
			if(cnt % 2 == 0) {
				continue;
			}
			System.out.println(cnt);
			if(cnt > 10) {
				break;
			}
		} while (true);
		System.out.println("��2.");

		
		// Ȧ���� �հ�
		
		cnt = 0;
		int sum = 0;
		
		do {
			cnt++;
			if(cnt % 2 == 0) {
				continue;
			}
			if (cnt >= 10) {
				break;
			}
			sum += cnt++;
		} while (true);
		System.out.println("sum: " + sum);
		
		
		
		// ������ ���� 1 ~ 10;
		// sum ���� 100���� ū ���� �Ǿ��� ��
		// �׶��� sum���� ����ϴµ� �� �� ������ �ؼ� ���Դ���
		// sum : 101, ����; 13
		

	}

}