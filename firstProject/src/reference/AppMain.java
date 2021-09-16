package reference;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		// 학생정보를 생성

		// 학생인원 지정, 학생점수, 전체리스트, 분석:평균, 최고점, 종료.
		int[] scores = null;
		while (true) {
			showMenu();
			int choice = readInt("번호를 선택하세요>>");

			if (choice == 1) {
				int size = createStudent();
				scores = new int[size];

			} else if (choice == 2) {
				inputValue(scores);

			} else if (choice == 3) {
				showList(scores);

			} else if (choice == 4) {
				analysis(scores);
			}

			} else if (choice == 5) {
				break;

			}
		}
		System.out.println("끝.");

	}

	public static void showMenu() {
		System.out.println("1: 학생인원 지정, 2: 학생점수입력, 3: 전체리스트, 4: 분석:평균, 5: 최고점, 6: 종료");
	}

	public static int createStudent() {
		int cnt = readInt("학생수를 입력하세요.");
		return cnt;
	}

	public static void inputValue(int[] ary) {
		if (ary == null) {
			System.out.println("먼저 학생수를 입력하세요.");
			return;
		}
		double avg = 0;
		int maxVal = 0, sum = 0;
		for (int score : ary) {

	int i = 0;i<ary.length;i++)
    {
		ary[i] = readInt("학생점수를 입력하세요.");
	
	}

	public static void showList(int[] ary) {
		for (int i=0; i<ary.length; i++ ) { // index는 0부터 시작하니까 i=0
			// scores[0] => 88
			System.out.printf("scores[%d] => %d\n", i, ary[i]);
		}

	}

	public static void analysis(int[] ary) {
		// 평균, 최고점 => 콘솔
		double avg = 0;
		int maxVal = 0, sum = 0;
		for(int score : ary) {
			sum += score;
			if(maxVal < score) {
				maxVal = score;
			}
		}
		avg = (double) sum / ary.length;
		
		System.out.printf("평균: %s, 최고점: %d", avg, maxVal);
	}

	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println(msg);
			try {
				int menu = scn.nextInt();
				return menu;
			} catch (Exception e) {
				System.out.println("값을 잘못 입력했습니다.");
			}
			scn.close();
		
	}

}
