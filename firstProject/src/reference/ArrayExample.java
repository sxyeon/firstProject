package reference;

public class ArrayExample {

	public static void main(String[] args) {
		// �л� 30��
		// int s1 ~ s30;
		// int num = 10, String str;
		int[] intAry = {1,2,3,4,5};
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		
		System.out.println("====�ٽ�====");
		
//      intAry = 10;
		intAry[0] = 6;
		intAry[1] = 7;
		intAry[2] = 8;
		intAry[3] = 9;
		intAry[4] = 10;
		
		for(int i=0; i<5; i++) {
			System.out.println(intAry[i]);
		}

		byte[] byteAry = {1,2,3};
		for(int i=0; i<3; i++) {
			System.out.println("byte�迭: " + byteAry[i]);
		}
		
		String[] strAry = { "Hello", "World", "Nice" };
		strAry = new String[] { "Hong", "Kim", "Park" }; // �����ߴ� ������ �ٸ� ���� ��ڴٴ� ��
		for(int i=0; i<3; i++) {
			System.out.println("String�迭: " + strAry[i]);
		}
		
		double[] dblAry; // �� ���� �̸��� �����س��� ����
		dblAry = new double[] { 1, 2.3, 5 }; // ���� ������ִ� �迭��
		
		System.out.println("====�迭====");
		float[] fltAry = new float[5]; // ũ�⸸ �����س��� ���� {0F, 0F, 0F, 0F, 0F} �ʱⰪ���� ������, 0.0�̶� �� ��µ�
		for(int i=0; i<fltAry.length; i++) { // �迭�� ũ�⸸ŭ �ݺ��ϰڴٴ� ��
			System.out.println(fltAry[i]);
		}
		
	}

}
