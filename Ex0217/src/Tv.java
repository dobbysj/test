
public class Tv {
	String color; // tv의 색상
	boolean power; // 전원
	int channel; // 채널
	void power() {
		if(power==true) { //power on 
			System.out.println("전원을 off 합니다.");
		} else {
			System.out.println("전원을 on 합니다.");
		}
		power = !power;
	}
	void channelUp() {
		System.out.println("채널을 1 증가합니다.");
		channel++;
		System.out.println("현재 채널 : "+channel);
	}
	void channelDown() {
		System.out.println("채널을 1 감소합니다.");
		channel--;
		System.out.println("현재 채널 : "+channel);
	}
	
	
	
}
