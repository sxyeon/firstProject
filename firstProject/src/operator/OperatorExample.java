package operator;

public class OperatorExample {
	public static void main(String[] args) {
		// +, -, *, /, %, &, |, ^, ~
		int num1, num2, result;
		num1 = 10;
		num2 = 5;
		
//		result = num2 = num1 ; 
		
		result = num1 * num2; // �Ҵ�(����)������ = 
		// -> �����ʿ� ������ ���� result�� ��ڴٴ� ��
		result = -result; //�����ʿ� �ִ� ���� ���ʿ� ��ڽ��ϴ�
		System.out.printf("-������: %d\n", result);
		
		result = num1 % 3; //num1�� 3���� ������ �� �������� result�� �ְڴٴ� ��
		System.out.printf("������: %d\n", result);
		
		result = num1 & num2;
		System.out.printf("& ������: %d\n", result);
		
		result = num1 | num2;
		System.out.printf("| ������: %d\n", result);
		
		result = num1 ^ num2;
		System.out.printf("^ ������: %d\n", result);
		
		result = ~num1; // 2���� => ��Ʈ �������Ѽ� 1�� ���ؼ� 0�̸�( + 1 = 0) 2������ ǥ���Ǵ� -����
		// 3 + (-3) = 0 10000011
		System.out.printf("~ ������: %d\n", result);
		
		// >>, >>>, << (��Ʈ������)
		result = num1 >> 2;
		System.out.printf(">> ������: %d\n", result);
		
		// &&, ||, ! (��������)
		boolean b1 = false;
		boolean b2 = !b1;
		
		boolean b3 = b1 && b2; // �� �� �ϳ��� false�� false���� ���ڴٴ� ��, &&�� �ƴ϶� ||�̸� �� �� �ϳ��� true�� true���� ��
		System.out.printf("b3 : %s, b1: %s, b2: %s", b3, b1, b2);
		
		
	}

}
