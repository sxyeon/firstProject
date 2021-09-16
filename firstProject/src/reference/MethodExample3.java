package reference;

public class MethodExample3 {

	public static void main(String[] args) {
	
		int[] intAry = { 30, 40, 50, 60, 70 };
		int sum = 0;
		int avg = 0;
		for(int num : intAry) {
			sum += num;
		}
		System.out.println("합1: " + sum);
		// 평균을 계산하는 메소드
		avg = avgArray(intAry);
		System.out.println("평균1: " + avg);
		
		sum = 0;
		int[] intAry2 = {30, 40};
		sum = sumArray(intAry2);
		System.out.println("합2: " + sum);
	}
	
	// 배열을 매개변수로 받아서 반환해주는 메소드
	public static int sumArray(int[] intAry) {
		int sum = 0;
		for(int num : intAry) {
			sum += num;
		}
		return sum;
	}
	
	// 배열을 매개변수 -> 평균 avgArray() .. 나누기해서 평균만 나오게 만들어주면 됨
	public static double avgArray(int[] intAry) {
		int sum = sumArray(intAry);
		double avg = (double) sum / intAry.length;
		return avg;
	}

	
}
