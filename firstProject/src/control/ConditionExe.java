package control;

public class ConditionExe {

	public static void main(String[] args) {
		// 두 정수 60, 70
		// 두 수를 합한 결과 100점 넘어서면 합격, 안 되면 불합격
		// 끝
		
		
		int num1 = 60;
		int num2 = 70;
		
		if(num1 + num2 >= 100) {
			System.out.println("합격");
			
		} else {
			System.out.println("불합격");
		}
		
	    System.out.println("끝");
	    
	    // 두 수를 곱해서 짝수이면 짝수, 홀수이면 홀수.
	    // 2번째 끝
	    
	    if((num1*num2)%2 == 0) {
	        System.out.println("짝수");
	    } else {
	    	System.out.println("홀수");
	    }
	   
	    System.out.println("2번째 끝");
	    
	    
	    
	    
	    // 4의 값
	    // 2의 배수이면 2의 배수, 3의 배수이면 3의 배수, 2와 3의 배수이면 2와 3의 배수입니다
	    
	    int num3 = 4
	    
	    if(num3%2==0 && num3%3==0) {
	    	System.out.println("2, 3의 공동배수입니다.");
	    } else if (num3%2==0) {
	    	System.out.println("2의 배수입니다");
	    	
	    } else if(num3%3==0) {
	    	System.out.println("3의 배수입니다");
	    }
	    
	    
	    
	    int ramdomValue = (int) (Math.random() * 6) + 1 ;
	    System.out.println(ramdomValue);
	    
	    
	    // switch조건문 -> 1이 나왔습니다.
	    // 4번끝
	    
	    
	    switch(ramdomValue) {
	    case 1:
	    	System.out.println("1이 나왔습니다");
	    	break;
	    case 2: 
	    	System.out.println("2가 나왔습니다");
	    	break;
	    case 3:
	    	System.out.println("3이 나왔습니다");
	    	break;
	    case 4:
	    	System.out.println("4가 나왔습니다");
	    	
	    }
	    
	    
	    System.out.println("4번끝");
	    
	   
	    
	    int randomScore = (int) (Math.random() * 100);
	    System.out.println(randomScore);
	    
	    if(randomScore >= 90) {
	    	System.out.println("A학점");
	    } else if (randomScore >= 80) {
	    	System.out.println("B학점");
	    } else if (randomScore >= 70) {
	    	System.out.println("C학점");
	    } else if (randomScore >= 60) {
	    	System.out.println("D학점");
	    } else {
	    	System.out.println("F학점");
	    }
	    
	    
	    
	   

	}

}
