package control;

public class ControlExample {
    public static void main(String[] args) {
		String inputValue = "A";
		
		switch(inputValue) { // switch�� �ϳ��� ���� ��Ȯ���� �ƴ�����! ���� ������ �� ����. ���� �����Ϸ��� if���� �����
		case "A":
			System.out.println("�����߽��ϴ�!!");
			break;
		case "B":
			System.out.println("���߽��ϴ�!!");
			break;
		case "C":
			System.out.println("�����Դϴ�!!");
			break;
		case "D":
			System.out.println("����ϼ���!!");
		    break;
		default:
			System.out.println("�Ǹ��Դϴ�!!");
		}
		
		//
		switch(inputValue) {
		case "A":
		case "B":
		case "C":
			System.out.println("Pass");
			break;
		case "D":
			System.out.println("retry");
			break;
		default:
			System.out.println("Fail");
			
		}

	}

}
