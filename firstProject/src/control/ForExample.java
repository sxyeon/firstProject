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
		System.out.println("====�ٽ�====");
		cnt = 0;
		for(int i = 1; i <= 5; i++) {  // i=i+1 => i+=1;
			cnt += i;
			System.out.printf("i: %d, cnt: %d\n", i, cnt);
		}
		System.out.println("�ݺ�����.");
		
		
		System.out.println("====�ٽ�2====");  
		int tempValue = 0;
		for(int i = 1; i <= 5; i++) {  // i=i+1 => i+=1;
//			tempValue = 0;
			tempValue += tempValue + (int)(Math.random()*10) + 1;
			System.out.printf("%d��° ��:%d\n", i, tempValue);
		}	
		System.out.println("sum:" + tempValue);
		System.out.println("�ݺ�����.");

	}

}
