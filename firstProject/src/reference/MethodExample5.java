package reference;

public class MethodExample5 {

	public static void main(String[] args) {
		// �ּҰ��� ���ϴ� �ڵ�.
		int[] scores = { 88, 67, 92, 73, 58 };
		int minVal = 0;
		boolean isTrue = false;
		
		for (int i = 0; i < scores.length; i++) {
			isTrue = minVal < scores[i];
			if (isTrue) {
				minVal = scores[i]
			}
		}
		
		
		System.out.println("��1.");
		
		System.out.println("��2.");

	}
	
	public static int getMinValue(int[] ary) {
		
		return 0;
	}

}
