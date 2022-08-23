class MyMath2{
	long a, b;	//iv 즉 인스턴스 변수
	
	// 인스턴스 변수 a, b만 이용하기 때문에 매개변수가 필요없다.
	long add()		{return a + b;}
	long subtract()	{return a - b;}
	long multply()	{return a * b;}
	double divide()	{return a / b;}
	
	// 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
	static long add(long a, long b)			 {return a + b;}
	static long subtract(long a, long b)	 {return a - b;}
	static long multply(long a, long b)		 {return a * b;}
	static double divide(double a, double b) {return a / b;}
}
public class Instance_Static {

	public static void main(String[] args) {
		// 클래스 메서드 호출, 인스턴스 생성없이 호출 가능하다.
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		// 인스턴스 메서드는 객체가 있어야만 사용할 수 있다.
		MyMath2 mm = new MyMath2(); // 인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multply());
		System.out.println(mm.divide());

	}

}

// static method는 객체의 생성없이 호출 가능하고, 인스턴스 변수를 사용하지 않는 메서드이다.
