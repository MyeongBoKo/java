public class ObjectEx1 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 " + t1.channel + "로 변경했습니다.");
		
		System.out.println("현재 채널은 " + t1.channel + "입니다.");
		System.out.println("현재 채널은 " + t2.channel + "입니다.");
		
		t2 =t1;   // 변수 t1에 있는 값을 t2에 대입. 즉 기존 t2의 참조변수와 객체의 연결이 끊기고, t1의 객체와 연결이 된다는 것을 의미
		t1.channel = 7;
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		
		System.out.println("현재 채널은 " + t1.channel + "입니다.");
		System.out.println("현재 채널은 " + t2.channel + "입니다.");
	}
}
		

//class Tv {
//	String color;
//	boolean power;
//	int channel;
//	
//	void power() {power = !power; }
//	void channelUp() { ++channel; }
//	void channelDown() { --channel; }
//}



		


	