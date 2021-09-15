package control;

public class ControlExample {
    public static void main(String[] args) {
		String inputValue = "A";
		
		switch(inputValue) { // switch는 하나의 값이 정확한지 아닌지만! 범위 지정할 수 없음. 범위 지정하려면 if구문 써야함
		case "A":
			System.out.println("참잘했습니다!!");
			break;
		case "B":
			System.out.println("잘했습니다!!");
			break;
		case "C":
			System.out.println("보통입니다!!");
			break;
		case "D":
			System.out.println("노력하세요!!");
		    break;
		default:
			System.out.println("실망입니다!!");
		}
		
		//
		switch(inputValue) {
		case "A":
		case "B":
		case "C":
			System.out.println("Pass");
			break;
		case "D":
			System.out.println("retry");
			break;
		default:
			System.out.println("Fail");
			
		}

	}

}
