package reference;

public class MethodExample3 {

	public static void main(String[] args) {
	
		int[] intAry = { 30, 40, 50, 60, 70 };
		int sum = 0;
		int avg = 0;
		for(int num : intAry) {
			sum += num;
		}
		System.out.println("��1: " + sum);
		// ����� ����ϴ� �޼ҵ�
		avg = avgArray(intAry);
		System.out.println("���1: " + avg);
		
		sum = 0;
		int[] intAry2 = {30, 40};
		sum = sumArray(intAry2);
		System.out.println("��2: " + sum);
	}
	
	// �迭�� �Ű������� �޾Ƽ� ��ȯ���ִ� �޼ҵ�
	public static int sumArray(int[] intAry) {
		int sum = 0;
		for(int num : intAry) {
			sum += num;
		}
		return sum;
	}
	
	// �迭�� �Ű����� -> ��� avgArray() .. �������ؼ� ��ո� ������ ������ָ� ��
	public static double avgArray(int[] intAry) {
		int sum = sumArray(intAry);
		double avg = (double) sum / intAry.length;
		return avg;
	}

	
}
