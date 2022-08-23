class Data {int x;}

public class PrimitiveParam {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);

	}



static void change(int x) {
	x = 1000; // 기본형 매개변수, 이때 지역변수 값을 바꾼것
	System.out.println("change() : x = "+ x);
	}
}
