import java.util.Scanner;

public class Ex0217_0 {

	public static void main(String[] args) {
		// 시24, 분60/int, 초59.5/float의 10개의 time을 입력받는다.(소수점 첫째자리까지
		// 배열을 선언해서 받으시오.
		Scanner scan = new Scanner(System.in);
		
		Time[] t = new Time[10];
		
		for(int i=0; i<t.length; i++) {
			t[i] = new Time();
			System.out.print("시를 입력하세요.>>");
			t[i].hour = scan.nextInt();
			System.out.print("분을 입력하세요.>>");
			t[i].minute = scan.nextInt();
			System.out.print("초를 입력하세요.>>");
			t[i].second = scan.nextFloat();
			t[i].print();
		}
		
		
//		Scanner scan = new Scanner(System.in);
//		int[] hour = new int[10];
//		int[] minute = new int[10];
//		float[] second = new float[10];
//		
//		for(int i=0; i<hour.length; i++) {
//			System.out.println(i+1+"번째 알람 설정");
//			System.out.println("시를 입력하세요.");
//			hour[i] = scan.nextInt();
//
//			System.out.println("분를 입력하세요.");			
//			minute[i] = scan.nextInt();
//
//			System.out.println("초를 입력하세요.");
//			second[i] = scan.nextFloat();
//
//			System.out.println(hour[i]+"시"+minute[i]+"분"+second[i]+"초 알람이 설정되었습니다.");
//			System.out.println("=========================================================");
//		}
		

	}//main

}//class
