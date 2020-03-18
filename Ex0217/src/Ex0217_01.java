import java.util.Scanner;

public class Ex0217_01 {

	public static void main(String[] args) {
		
		//( 기본 – 이름, 국어, 영어,수학,합계,평균,등수 )
		//( 옵션 – 1. 학생추가  2.학생출력  3.등수처리  0.종료 )

		Scanner scan = new Scanner(System.in);

		int select = 0;
		String[] sub = {"이름", "국어", "영어", "수학", "합계", "평균", "등수"};
		String[] name = new String[5];
		String search = "";
		int[][] score = new int[name.length][4];
		double[] avg = new double[name.length];
		int[] rank = new int[name.length];
		int st_cnt = 0;
		int check = -1;
		
		while(true) {
			System.out.println("=======[성적처리 프로그램]=======");
			System.out.println("1. 학생추가");
			System.out.println("2. 성적출력");
			System.out.println("3. 학생검색");
			System.out.println("0. 종료");
			System.out.println("=============================");
			System.out.print("번호를 입력하세요. >>");
			select = scan.nextInt();
			
			if(select==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch(select) {
			case 1:
				System.out.println("====================");
				System.out.println("학생 추가를 선택하셨습니다.");
				System.out.println("====================");
				//input
				//name, score, sum, avg
				for(int i=st_cnt; i<name.length; i++) {
					System.out.println(i+1+"번째 학생의 이름을 입력하세요.(이전 화면:99)");
					name[i] = scan.next();
					if(name[i].equals("99")) {
						System.out.println("이전 화면으로 돌아갑니다.");
						i--;
						break;
					}
					for(int j=0; j<score[i].length-1; j++) {
						System.out.println(name[i]+"학생의 "+sub[j+1]+" 점수를 입력하세요.");
						score[i][j] = scan.nextInt();					
						score[i][score[i].length-1] += score[i][j];
					}
					avg[i] = score[i][score[i].length-1] / 3.0;
					st_cnt++;
				}
				
				//등수
				for(int i=0; i<score.length; i++) {
					rank[i] = 1;
					for(int j=0; j<score.length; j++) {
						if(score[i][score[i].length-1] < score[j][score[i].length-1]) {
							rank[i]++;
						}
					}//j for
				}//i for
				break;
			case 2:
				System.out.println("====================");
				System.out.println("성적 출력을 선택하셨습니다.");
				System.out.println("====================");				
				//출력
				for(int i=0; i<sub.length; i++) {
					System.out.print(sub[i]+"\t");
				}
				System.out.println();
				for(int i=0; i<st_cnt; i++) {
					System.out.print(name[i]+"\t");
					for(int j=0; j<score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.printf("%.1f\t",avg[i]);
					System.out.print(rank[i]+"\t");
					System.out.println();
				}
				System.out.println("==========================");
				break;
			case 3:
				System.out.println("====================");
				System.out.println("학생 검색을 선택하셨습니다.");
				System.out.println("====================");		
				while(true) {
					System.out.println("검색할 학생의 이름을 정확히 입력해 주세요.(이전 화면:99)");
					search = scan.next();
					if(search.equals("99")) {
						System.out.println("이전 화면으로 돌아갑니다.");
						break;
					}
					
					for(int i=0; i<st_cnt; i++) {
						if(search.equals(name[i])) {
							check = i;
							break;
						}
						check = -1;
					}	
					
					if(check!=-1) {
						for(int i=0; i<sub.length; i++) {
							System.out.print(sub[i]+"\t");
						}
						System.out.println();
						System.out.print(name[check]+"\t");
						for(int i=0; i<score[check].length; i++) {	
							System.out.print(score[check][i]+"\t");
						}
						System.out.printf("%.1f\t",avg[check]);
						System.out.print(rank[check]+"\t");
						System.out.println();
						System.out.println("==========================");
					} else {
						System.out.println("잘못 입력했습니다.");
						continue;
					}
					
					
				}//while
				break;
			default :
				break;
			}//switch
			
			
		}//while
		

		
		
		
	}//main

}//class
