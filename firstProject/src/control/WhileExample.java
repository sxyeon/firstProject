package control;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1; //�ʱ��
		while(i <= 10) {
			System.out.printf("i�� ���� %d\n", i);
			i++;
		}
		
		boolean run = true;
		int cnt = 0;
		while(run) {
			cnt = (int) (Math.random() * 10) + 1;
			System.out.println(cnt);
			if(cnt == 8) {
				run = false;
			}
		}
		
		System.out.println("��.");
	}

}
