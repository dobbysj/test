import java.util.Scanner;

public class Ex0217_02 {

	public static void main(String[] args) {
		
		//대문자 입력시 소문자 출력 프로그램
		//( 기본 – 대문자만 1개 입력시 소문자로 변환 )
		//( 옵션 – 대문자 입력시 소문자로, 소문자 입력시 대문자로 문자열 입력 가능 )
		
		System.out.println('A'+32);
		
		Scanner scan = new Scanner(System.in);
		
		String input = "";
		System.out.println("문자를 무작위로 입력");
		input = scan.next();
		char[] input2 = new char[input.length()];
		
		for(int i=0; i<input.length(); i++) {
			input2[i] = input.charAt(i);
			if(input2[i]>='a' && input2[i]<='z') {
				input2[i] = (char)(input2[i] - 32);
			} else if(input2[i]>='A' && input2[i]<='Z') {
				input2[i] = (char)(input2[i] + 32);
			}
		}//for
		
		for(int i=0; i<input2.length; i++) {
			System.out.print(input2[i]);			
		}

		
	}//main

}//class
