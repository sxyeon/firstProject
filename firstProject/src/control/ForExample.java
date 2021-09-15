package control;

public class ForExample {

	public static void main(String[] args) {
		int cnt = 0;
		
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		System.out.println("====다시====");
		cnt = 0;
		for(int i = 1; i <= 5; i++) {  // i=i+1 => i+=1;
			cnt += i;
			System.out.printf("i: %d, cnt: %d\n", i, cnt);
		}
		System.out.println("반복문끝.");
		
		
		System.out.println("====다시2====");  
		int tempValue = 0;
		for(int i = 1; i <= 5; i++) {  // i=i+1 => i+=1;
//			tempValue = 0;
			tempValue += tempValue + (int)(Math.random()*10) + 1;
			System.out.printf("%d번째 값:%d\n", i, tempValue);
		}	
		System.out.println("sum:" + tempValue);
		System.out.println("반복문끝.");

	}

}
