import java.util.Scanner;

public class Ex0217_05 {

	public static void main(String[] args) {
		
		//추우 개발 형태
		// 1. 게시판 리스트 / 글보기
		// 2. 글쓰기(입력)
		// 3. 글삭제
		// 4. 글수정
		// 0. 종료
		
		Scanner scan = new Scanner(System.in);
		
		Board[] b = new Board[2];
		int b_num = 0;
		int v_num = 0;
			
		for(int i=0; i<b.length; i++) {
			b[i] = new Board();
			System.out.println("[ 게시판 글 등록 ]");
			b[i].num = b_num+1;
			System.out.println("제목을 입력하세요.");
			b[i].title = scan.nextLine();
			System.out.println("내용을 입력하세요.");
			b[i].content = scan.nextLine();
			System.out.println("작성자를 입력하세요.");
			b[i].name = scan.nextLine();
			b[i].count = v_num;//조회수 초기화
			b_num++;//글번호 자동증가
			System.out.println("글 등록이 완료되었습니다.");
			System.out.println("========================================");
			System.out.println("             [ 글 리스트 출력 ]");
			System.out.println("========================================");
			b[i].printSub(); //상단 subject출력
			System.out.println();
			//글목록 노출
			for(int j=0; j<b_num; j++) {
				b[j].print();	
				System.out.println();
			}
			System.out.println();
		}
		

		
		
	}

}
