
public class Board {
	int num;
	String title;
	String content;
	String name;
	int count;
	String[] sub = {"��ȣ","����","����","�ۼ���","��ȸ��"}; 
	
	void printSub() {
		for(int i=0; i<sub.length; i++) {			
			System.out.print(sub[i]+"\t");
		}
	}
	
	void print() {
		System.out.print(num+"\t"+title+"\t"+content+"\t"+name+"\t"+count+"\t");
	}
	
}
