package reference;


public class MethodExample2 {

	public static void main(String[] args) {
		sum(24, 55); // �޼ҵ� ����. ���⿡�� ���� ���� ������ Ÿ�� ���Ǵ� �����ϴ� �κп���!!
		int a = 45, b = 77;
		sum(a, b);
		
		multi(35, 88);
		
		getArea(3.5);
		
		int res = getMax(a, b);
		System.out.println("ū ���� : " + res);
		
		divide(5, 3);
		System.out.println("����� : " + divide(5,3));
	}

	// �� ������ �Է¹޾Ƽ� �� ���� ���� console�� �����ִ� ���α׷�
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("�� ���� ��: " + sum);
		
	}
	
	// �� ���Ҹ� �Է¹޾Ƽ� �� ���� ���� console�� �����ִ� ���α׷�
	public static void multi(int i1, int i2) {
		int g = i1 * i2;
		System.out.println("�� ���� ��: " + g);
	}
	
	// ���簢�� �ʺ� ������ִ� �޼ҵ�
	public static void getArea(double side) {
		double sum = side * side;
		System.out.println("���簢���� �ʺ�: " + sum);
	}
	
	// �� �� �߿��� ū ���� ��ȯ���ִ� �޼ҵ�
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2) ? num1 : num2;
		return result;
	}
	
	// �� ������ �Է¹޾Ƽ� ù ��° ���� �� ��° ������ ���� ���
	public static double divide(int a, int b) {
		return(double) a / b; // return -> ��ȯ
		
	}
}
