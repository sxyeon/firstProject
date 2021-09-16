package reference;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 1 ~ 10까지 임의의 수를 생성.
		// 학생 10명.
		int[] scores = new int[10]; // 0, 0, 0, 0, 0, 0, 0, 0
		System.out.println(scores.length);
		for (int i = 0; i < scores.length; i++) {
			int temp = (int) (Math.random() * 10) + 1; // 학생
			scores[i] = temp;
		}
		
		// 출력
		for (int i = 0, l = scores.length; i < l; i++) {
			System.out.printf("scores[%d] => %d\n", i, scores[i]);
		}
		System.out.println("끝.");
		
		// 배열에 들어있는 요소들의 합.
		int sum = 0;
		// 배열의 합계: 55
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("배열의 합계: " + sum);
		System.out.println("끝2.");
		
		// 배열의 요소 중 5보다 큰 값만 합계
		// if 사용
		sum = 0;
		for (int i=0;
			
		}
		
		System.out.println("끝3.");
		
		// 배열 요소 중 짝수번째 값만 합계
		System.out.println("끝4.");
		
	}

}
