package operator;

public class OperatorExample2 {

	public static void main(String[] args) {
		// 대입(할당)연산자
		int num1, num2, result;
		num1 = num2 = 10;
		
		result = num1 + num2;
		
		result = result + 10;
		result += 10;
		
		result -= 10; // result = result - 10;
		result *= 10; // result = result * 10;
		result /= 10; // result = result / 10;
		result %= 10; // result = result를 10으로 나눈 나머지를 result에 넣음
		
		String str = "Hello";
		str = str + "World";
		str += " Welcome";
		System.out.println(str);
		
		// 3항 연산자
		int score = 80;
		boolean pass = (score > 60) ? true : false; // score가 60이 넘으면 true를 출력해주고 아니면 false 출력
		String isOK = (score > 60) ? "Pass" : "Fail"; // 조건을 만족하면 Pass출력 아니라면 Fail 출력

	}

}
