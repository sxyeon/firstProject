package control;

public class ForExe {

	public static void main(String[] args) {
		// 1 ~ 10 ���
		// ��1.

		int Value = 0;
		for (int i = 1; i <= 10; i++) {
			Value += 1;
			System.out.println(Value);
		}
		System.out.println("��1");

		// 1 ~ 10 �߿��� 2, 4, 6, 8, 10 ���
		// ��2.

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}
		}

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		//
		
		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			sum += i;

		}

		System.out.println(sum);
	}

}