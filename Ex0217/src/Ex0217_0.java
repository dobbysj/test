import java.util.Scanner;

public class Ex0217_0 {

	public static void main(String[] args) {
		// ��24, ��60/int, ��59.5/float�� 10���� time�� �Է¹޴´�.(�Ҽ��� ù°�ڸ�����
		// �迭�� �����ؼ� �����ÿ�.
		Scanner scan = new Scanner(System.in);
		
		Time[] t = new Time[10];
		
		for(int i=0; i<t.length; i++) {
			t[i] = new Time();
			System.out.print("�ø� �Է��ϼ���.>>");
			t[i].hour = scan.nextInt();
			System.out.print("���� �Է��ϼ���.>>");
			t[i].minute = scan.nextInt();
			System.out.print("�ʸ� �Է��ϼ���.>>");
			t[i].second = scan.nextFloat();
			t[i].print();
		}
		
		
//		Scanner scan = new Scanner(System.in);
//		int[] hour = new int[10];
//		int[] minute = new int[10];
//		float[] second = new float[10];
//		
//		for(int i=0; i<hour.length; i++) {
//			System.out.println(i+1+"��° �˶� ����");
//			System.out.println("�ø� �Է��ϼ���.");
//			hour[i] = scan.nextInt();
//
//			System.out.println("�и� �Է��ϼ���.");			
//			minute[i] = scan.nextInt();
//
//			System.out.println("�ʸ� �Է��ϼ���.");
//			second[i] = scan.nextFloat();
//
//			System.out.println(hour[i]+"��"+minute[i]+"��"+second[i]+"�� �˶��� �����Ǿ����ϴ�.");
//			System.out.println("=========================================================");
//		}
		

	}//main

}//class
