package reference;

public class EnhanceForExample {

	public static void main(String[] args) {
		String[] strAry = null;
		strAry = new String[5]; // 값은 안 담았는데 크기만 다섯 개로 할당해줌 | null, null, null, null, null (초기값으로 널값이 들어가있음)
		strAry = new String[] {"Hong","Park","Choi","Kim","Hwang"};
		System.out.println(strAry.length);
		
		strAry[2] = "Hong"; // int타입은 ==, 문자는 equals()
		
		for(int i=0; i<strAry.length; i++) {
			if(strAry[i].equals("Hong"))
			System.out.println(strAry[i]);
		}
		System.out.println("====다시====");
		
		// Enhanced for
		for(String name : strAry) {
			System.out.println(name);
		}
		
		int[] scores = {50, 70, 80, 60};
		int sum = 0;
		for(int score : scores) { // 받아야 될 타입이 int라는 것을 알려주는 것
			sum += score;
		}
		
		// 학생 3명. 4.2, 3.5, 2.8 배열 선언 (double타입 사용)
		// 합계 담을 수 있도록 변수
		// 평균을 계산해서 avg
		// 학생평균: 3.xx입니다. 출력
		double[] score = {4.2,3.5,2.8}
		double  avg

	}

}
