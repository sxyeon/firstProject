package firstProject;

public class VariableExample {
    public static void main(String[] args) {
		int number1 = 10; // ���� <--> ���
		number1 = 20;
		number1 = 30;
		System.out.println("���: " + number1);
		
		int number3 = 90;
		int result;
		
		final int number2 = 20;
//		number2 = 30; �̰� ����̱� ������ �����߻�
		// byte < short < int < long < float < double
	    result = number1 + number2;
	    double result1 = number3 / 20.0;
	    
	    System.out.println("�����: " + result1);
	    
	}
}
