import java.util.Scanner;

public class Ex0217_05 {

	public static void main(String[] args) {
		
		//�߿� ���� ����
		// 1. �Խ��� ����Ʈ / �ۺ���
		// 2. �۾���(�Է�)
		// 3. �ۻ���
		// 4. �ۼ���
		// 0. ����
		
		Scanner scan = new Scanner(System.in);
		
		Board[] b = new Board[2];
		int b_num = 0;
		int v_num = 0;
			
		for(int i=0; i<b.length; i++) {
			b[i] = new Board();
			System.out.println("[ �Խ��� �� ��� ]");
			b[i].num = b_num+1;
			System.out.println("������ �Է��ϼ���.");
			b[i].title = scan.nextLine();
			System.out.println("������ �Է��ϼ���.");
			b[i].content = scan.nextLine();
			System.out.println("�ۼ��ڸ� �Է��ϼ���.");
			b[i].name = scan.nextLine();
			b[i].count = v_num;//��ȸ�� �ʱ�ȭ
			b_num++;//�۹�ȣ �ڵ�����
			System.out.println("�� ����� �Ϸ�Ǿ����ϴ�.");
			System.out.println("========================================");
			System.out.println("             [ �� ����Ʈ ��� ]");
			System.out.println("========================================");
			b[i].printSub(); //��� subject���
			System.out.println();
			//�۸�� ����
			for(int j=0; j<b_num; j++) {
				b[j].print();	
				System.out.println();
			}
			System.out.println();
		}
		

		
		
	}

}
