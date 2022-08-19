
public class VarEx3 {

	public static void main(String[] args) {
		//int score = 100;
		final int score = 100; // 상수
		//score = 200; // 상수이기 때문에 생기는 에러
		//final int score; // 예전에는 상수 선언과 동시에 초기화를 했어야 하는데 현재를 그렇게 하지 않아도 된다. 가능하면 선언과 동시에 같이 하는 것을 권장한다.
		//score = 200; 
		//System.out.println(score);
		
		//boolean power = true;
		//System.out.println(power);
		
		//boolean power = false;
		//boolean power = 0; // boolean타입에 true or false가 아닌 다른 값을 넣으면 오류가 발생한다.
		
		byte b = 127; //-128 ~127
		
		int oct = 010;  // 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수로 16
//		System.out.println(oct);
//		System.out.println(hex);
		
		long l = 10_000_000_000L;
		
		float f = 3.14f;  // f 생략 불가
		//double d = 3.14d; // d 생략 가능,
		double d = 3.14f; // 가능
		
//		System.out.println(10.);
//		System.out.println(.10);
//		System.out.println(10f);
//		System.out.println(1e3);
		
		char ch = 'A'; // 하나의 문자가 들어와야 한다. 이때 빈칸이면 안된다.
		int i = 'A';  // 문자 A를 int형 타입으로 저장하면 변수 i에는 문자 A의 문자 코드가 저장된다.
		//System.out.println(i);
		
//		String str = ""; 	// 빈 문자열(empty string)
//		String str2 = "ABCD";
//		String str3 = "123";
//		String str4 = str2 + str3;
//		System.out.println(str4);
		
		System.out.println(""+7+7);
		System.out.println(7+7+"");
		
		
		
	}                      

}
