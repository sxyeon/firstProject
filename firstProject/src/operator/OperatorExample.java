package operator;

public class OperatorExample {
	public static void main(String[] args) {
		// +, -, *, /, %, &, |, ^, ~
		int num1, num2, result;
		num1 = 10;
		num2 = 5;
		
//		result = num2 = num1 ; 
		
		result = num1 * num2; // 할당(대입)연산자 = 
		// -> 오른쪽에 연산한 값을 result에 담겠다는 것
		result = -result; //오른쪽에 있는 값을 왼쪽에 담겠습니다
		System.out.printf("-연산결과: %d\n", result);
		
		result = num1 % 3; //num1을 3으로 나누고 그 나머지를 result에 넣겠다는 뜻
		System.out.printf("연산결과: %d\n", result);
		
		result = num1 & num2;
		System.out.printf("& 연산결과: %d\n", result);
		
		result = num1 | num2;
		System.out.printf("| 연산결과: %d\n", result);
		
		result = num1 ^ num2;
		System.out.printf("^ 연산결과: %d\n", result);
		
		result = ~num1; // 2진수 => 비트 반전시켜서 1을 더해서 0이면( + 1 = 0) 2진수로 표현되는 -값임
		// 3 + (-3) = 0 10000011
		System.out.printf("~ 연산결과: %d\n", result);
		
		// >>, >>>, << (비트연산자)
		result = num1 >> 2;
		System.out.printf(">> 연산결과: %d\n", result);
		
		// &&, ||, ! (논리연산자)
		boolean b1 = false;
		boolean b2 = !b1;
		
		boolean b3 = b1 && b2; // 둘 중 하나라도 false면 false값을 내겠다는 것, &&이 아니라 ||이면 둘 중 하나라도 true면 true값을 냄
		System.out.printf("b3 : %s, b1: %s, b2: %s", b3, b1, b2);
		
		
	}

}
