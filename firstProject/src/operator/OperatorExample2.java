package operator;

public class OperatorExample2 {

	public static void main(String[] args) {
		// ����(�Ҵ�)������
		int num1, num2, result;
		num1 = num2 = 10;
		
		result = num1 + num2;
		
		result = result + 10;
		result += 10;
		
		result -= 10; // result = result - 10;
		result *= 10; // result = result * 10;
		result /= 10; // result = result / 10;
		result %= 10; // result = result�� 10���� ���� �������� result�� ����
		
		String str = "Hello";
		str = str + "World";
		str += " Welcome";
		System.out.println(str);
		
		// 3�� ������
		int score = 80;
		boolean pass = (score > 60) ? true : false; // score�� 60�� ������ true�� ������ְ� �ƴϸ� false ���
		String isOK = (score > 60) ? "Pass" : "Fail"; // ������ �����ϸ� Pass��� �ƴ϶�� Fail ���

	}

}
