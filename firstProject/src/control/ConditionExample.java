package control;

public class ConditionExample {
	public static void main(String[] args) {
		int score = 70;
		
		if(score >= 60) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
		// 90�̻� A, 80�̻� B, 70�̻� C, 60�̻� D, �� �� F
		if(score >= 90) {
			System.out.println("A����");
		}
			
		  else if (score >= 80) {
			System.out.println("B����");
		} else if (score >= 70) {
			System.out.println("C����");
		} else if (score >= 60) {
			System.out.println("D����");
		} else {
			System.out.println("F����");
		}
		
		System.out.println("��.");
	}

}
