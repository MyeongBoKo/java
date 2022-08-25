

public class Inheritance_1 {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello world!");
		ctv.caption = true;
		ctv.displayCaption("Hello world!");
	}
}
		
class Tv{	
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv{
	boolean caption;	// 캡션상태(on/off)
	void displayCaption (String text) {
		if (caption) {  // 캡션 상태가 on (true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}		
		




