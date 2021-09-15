package control;

public class DoWhileExe {
	public static void main(String[] args) {
		boolean run = false;

		// 1부터 10까지 출력
		// 끝1.

		int cnt = 0;
		

		do {
			cnt++;
			if (cnt > 10) {
				break;

			}
			System.out.println(cnt);
		} while (true);

		System.out.println("끝1.");

		// 짝수만 출력

		cnt = 0;
		
		do {
			cnt++;
			if(cnt % 2 == 0) {
				continue;
			}
			System.out.println(cnt);
			if(cnt > 10) {
				break;
			}
		} while (true);
		System.out.println("끝2.");

		
		// 홀수만 합계
		
		cnt = 0;
		int sum = 0;
		
		do {
			cnt++;
			if(cnt % 2 == 0) {
				continue;
			}
			if (cnt >= 10) {
				break;
			}
			sum += cnt++;
		} while (true);
		System.out.println("sum: " + sum);
		
		
		
		// 임의의 값을 1 ~ 10;
		// sum 값이 100보다 큰 수가 되었을 때
		// 그때의 sum값을 출력하는데 몇 번 실행을 해서 나왔는지
		// sum : 101, 실행; 13
		

	}

}