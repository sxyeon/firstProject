package control;

public class ConditionExe {

	public static void main(String[] args) {
		// �� ���� 60, 70
		// �� ���� ���� ��� 100�� �Ѿ�� �հ�, �� �Ǹ� ���հ�
		// ��
		
		
		int num1 = 60;
		int num2 = 70;
		
		if(num1 + num2 >= 100) {
			System.out.println("�հ�");
			
		} else {
			System.out.println("���հ�");
		}
		
	    System.out.println("��");
	    
	    // �� ���� ���ؼ� ¦���̸� ¦��, Ȧ���̸� Ȧ��.
	    // 2��° ��
	    
	    if((num1*num2)%2 == 0) {
	        System.out.println("¦��");
	    } else {
	    	System.out.println("Ȧ��");
	    }
	   
	    System.out.println("2��° ��");
	    
	    
	    
	    
	    // 4�� ��
	    // 2�� ����̸� 2�� ���, 3�� ����̸� 3�� ���, 2�� 3�� ����̸� 2�� 3�� ����Դϴ�
	    
	    int num3 = 4
	    
	    if(num3%2==0 && num3%3==0) {
	    	System.out.println("2, 3�� ��������Դϴ�.");
	    } else if (num3%2==0) {
	    	System.out.println("2�� ����Դϴ�");
	    	
	    } else if(num3%3==0) {
	    	System.out.println("3�� ����Դϴ�");
	    }
	    
	    
	    
	    int ramdomValue = (int) (Math.random() * 6) + 1 ;
	    System.out.println(ramdomValue);
	    
	    
	    // switch���ǹ� -> 1�� ���Խ��ϴ�.
	    // 4����
	    
	    
	    switch(ramdomValue) {
	    case 1:
	    	System.out.println("1�� ���Խ��ϴ�");
	    	break;
	    case 2: 
	    	System.out.println("2�� ���Խ��ϴ�");
	    	break;
	    case 3:
	    	System.out.println("3�� ���Խ��ϴ�");
	    	break;
	    case 4:
	    	System.out.println("4�� ���Խ��ϴ�");
	    	
	    }
	    
	    
	    System.out.println("4����");
	    
	   
	    
	    int randomScore = (int) (Math.random() * 100);
	    System.out.println(randomScore);
	    
	    if(randomScore >= 90) {
	    	System.out.println("A����");
	    } else if (randomScore >= 80) {
	    	System.out.println("B����");
	    } else if (randomScore >= 70) {
	    	System.out.println("C����");
	    } else if (randomScore >= 60) {
	    	System.out.println("D����");
	    } else {
	    	System.out.println("F����");
	    }
	    
	    
	    
	   

	}

}
