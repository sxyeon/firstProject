package control;

public class ParkSoyeon {

	public static void main(String[] args) {
		
		//if for(while) break, continue
		
		int a = 1;
		
		do {
			a++;
			if((a * 2) <= 10) {
				continue;
			}
			System.out.println(a);
			if (a <= 30) {
				break;
			}
		} while (true);
		System.out.println("..");

	}

}
