package firstProject;

public class StringExample {
	
	public static void main(String[] args) {
		int age = 20;
		String name = "ȫ�浿";
	
		long myAge = age; // �ڵ�����ȯ(promotion)
		age = (int) myAge; // ��������ȯ(casting)
		
//		age = "ȫ�浿";
//		name = 20;
		System.out.println(name + "�� ���̴� " + age);
		
		
		
		
	}
}
