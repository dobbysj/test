
public class Tv {
	String color; // tv�� ����
	boolean power; // ����
	int channel; // ä��
	void power() {
		if(power==true) { //power on 
			System.out.println("������ off �մϴ�.");
		} else {
			System.out.println("������ on �մϴ�.");
		}
		power = !power;
	}
	void channelUp() {
		System.out.println("ä���� 1 �����մϴ�.");
		channel++;
		System.out.println("���� ä�� : "+channel);
	}
	void channelDown() {
		System.out.println("ä���� 1 �����մϴ�.");
		channel--;
		System.out.println("���� ä�� : "+channel);
	}
	
	
	
}
