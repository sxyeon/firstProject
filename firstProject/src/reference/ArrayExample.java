package reference;

public class ArrayExample {

	public static void main(String[] args) {
		// 학생 30명
		// int s1 ~ s30;
		// int num = 10, String str;
		int[] intAry = {1,2,3,4,5};
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		
		System.out.println("====다시====");
		
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
			System.out.println("byte배열: " + byteAry[i]);
		}
		
		String[] strAry = { "Hello", "World", "Nice" };
		strAry = new String[] { "Hong", "Kim", "Park" }; // 선언했던 변수에 다른 값을 담겠다는 것
		for(int i=0; i<3; i++) {
			System.out.println("String배열: " + strAry[i]);
		}
		
		double[] dblAry; // 값 없이 이름만 선언해놓은 상태
		dblAry = new double[] { 1, 2.3, 5 }; // 값이 담겨져있는 배열값
		
		System.out.println("====배열====");
		float[] fltAry = new float[5]; // 크기만 지정해놓은 상태 {0F, 0F, 0F, 0F, 0F} 초기값으로 지정됨, 0.0이란 값 출력됨
		for(int i=0; i<fltAry.length; i++) { // 배열의 크기만큼 반복하겠다는 뜻
			System.out.println(fltAry[i]);
		}
		
	}

}
