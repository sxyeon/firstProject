package reference;

public class ForExample {

	public static void main(String[] args) {
		
		{
			int i = 0;
			int j = 0;
		}
		
		int j = 1;
		
		//
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("끝1.");

		// 1 ~ 10 짝수만 출력
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}
		}
		System.out.println("끝2.");

		// 1 ~ 10 홀수만 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			// 홀수인 경우만 합계
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("합계: " + sum);
		System.out.println("끝3.");

		sum = 0;
		int cnt = 0;
//		int i = 0;
		// 1 ~ 10 sum의 값이 20을 넘어서는 그떄의 횟수.
		for (int i = 1; i <= 10; i++) {
			sum += i;
			if (sum >= 20) {
				// i값을 반환.
				cnt = 1;
				break;
			}
		}
		
		System.out.println("횟수: " + cnt);
		
	}

}
