
public class Student {
	
	String name; //�̸�
	int kor; //��������
	int eng;//��������
	int math;//��������
	int total;//�հ�
	double avg;//���
	int rank;//���
	
	void total() {
		total = kor + eng + math;
	}
 	
	void avg() {
		avg = total / 3;
	}
	
}//class
