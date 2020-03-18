import java.util.Scanner;

public class Ex0217_03 {

	public static void main(String[] args) {
		
		//5명 학생의 국영수 점수를 입력받으세요 .
		
		//학생 객체 선언
		Student[] stu = new Student[2];
		
		
		Scanner scan = new Scanner(System.in);
		String[] sub = {"이름","국어점수", "영어점수","수학점수","합계","평균"};
//		String[] name = new String[5];
//		int[][] score = new int[5][4];
//		double[] avg = new double[5];
//		int[] rank = new int[5];
		
		for(int i=0; i<stu.length; i++) {
			stu[i] = new Student(); //배열 객체의 각 배열도 각각의 객체이므로 객체 선언을 해주는 것임
			System.out.println("이름입력");
			stu[i].name=scan.next();
			System.out.println("국어점수를 입력해 주세요.");
			stu[i].kor=scan.nextInt();
			System.out.println("영어점수를 입력해 주세요.");
			stu[i].eng=scan.nextInt();
			System.out.println("수학점수를 입력해 주세요.");
			stu[i].math=scan.nextInt();
			stu[i].total();
			stu[i].avg();	
		}	
		
		for(int i=0; i<sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<stu.length; i++) {
			System.out.print(stu[i].name + "\t");
			System.out.print(stu[i].kor + "\t");
			System.out.print(stu[i].eng + "\t");
			System.out.print(stu[i].math + "\t");
			System.out.print(stu[i].total + "\t");
			System.out.print(stu[i].avg + "\t");
			System.out.println();
		}
		
		
		
		
		
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
//		
//		
//		t1.channel=10;
//		
//		System.out.println(t1.channel);
//		System.out.println(t2.channel);
		
		
		
		
//		Tv2 t2 = new Tv2();
//		t2.volume = 10;
//		System.out.println("현재 볼륨은 "+t2.volume+" 입니다.");
//		t2.volumeUp();
//		System.out.println("현재 볼륨은 "+t2.volume+" 입니다.");
		
		
		
		
//		Tv t = new Tv();
//		t.channel=8;
//		t.channelUp(); //t.channel=8 이런식으로 바로 넣어도 됨
			
		
//		Student stu1 = new Student();
//		stu1.name = "홍길동";
//		stu1.kor = 100;
//		stu1.eng = 100;
//		stu1.math = 90;
//		stu1.total = stu1.kor + stu1.eng + stu1.math;
//		stu1.avg = stu1.total / 3;
//		stu1.rank = 1;
//		
//		System.out.println(stu1.name+" "+stu1.kor+" "+stu1.eng);
		
		
		

	}//main

}//class
