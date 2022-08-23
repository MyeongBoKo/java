
public class Instance_Static_error {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv; 		//에러발생. 클래스메서드에 인스턴스 변수를 사용할 수 없다.
	static int cv2 = new Instance_Static_error().iv;	// 객체를 생성시켜야만 인스턴스 변수를 사용할 수 있다.
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);	//클래스 메서드에서 인스턴스 변수를 사용할 수 없다.
		Instance_Static_error m = new Instance_Static_error();	// 객체를 생성해야만 사용할 수 있다.
		System.out.println(m.iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);		//인스턴스 메서드에서 cv는 사용가능하다.
		System.out.println(iv);		//인스턴스 메서드에서 인스턴스변수를 바로 사용가능하다.
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();		//클래스메서드에서는 인스턴스메서드는 호출 불가
		Instance_Static_error i = new Instance_Static_error();
		i.instanceMethod1();	// 객체를 생성해야만 인스턴스메서드를 호출할 수 있다.
	}
	void instanceMethod2() {
		staticMethod1();		//인스턴스 메서드에서는 클래스메서드와 인스턴스메서드 둘다 호출 가능하다.
		instanceMethod1();		//인스턴스 생성없이 호출가능하다.
	}
	
}
