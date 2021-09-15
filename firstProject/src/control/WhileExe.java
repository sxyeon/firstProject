package control;

public class WhileExe {
	public static void main(String[] args) {
		
		// while 구문 1 ~ 10까지 출력
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
	
		
		// 2, 4, 6, 8, 10
		
		i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		
		// 1, 3, 5, 7, 9
		
		i = 1;
		while(i <= 10) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}
	
		
		// 
		
		i = 1;
		int sum = 0;
		
	}

}
