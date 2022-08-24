/*
 Constructor(생성자) - 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드이다.
 
 생성자 특징
 1. 생성자의 이름은 클래스와 같아야 한다.
 2. 생성자는 리턴 값이 없다. 이때 모든 생성자는 리턴 값이 없기 떄문에 void를 생략한다.
 3. 모든 클래스는 생성자를 가져야 한다.
 
 생성자의 구조
 클래스이름(타입 변수명, 타입 변수명, ... ) {
 	// 인스턴스 생성 시 수행될 코드,
 	// 주로 인스턴스 변수의 초기화 코드를 적는다.
 }
 
 Card c = new Card();
 
 1. 연산자 new에 의해서 메모리에 Card클래스의 인스턴스가 생성
 2. 생성자 Card()가 호출되어 수행된다.
 3. 연산자 new의 결과로, 생성된 Card인스턴스의 주소가 반환되어 참조변수 c에 저장된다.
 */

public class DefaultConstructor {

	public static void main(String[] args) {
		CData1 d1 = new CData1();
		CData2 d2 = new CData2();		// 기본생성자가 없다. 그래서 컴파일러가 읽을 수 없다. 
// 		CData2 d2 = new CData2(x);		// 이 코드처럼 작성하거나, 기본생성자를 추가 해줘야 한다.

	}

}

class CData1{		// 생성자가 없기 때문에 컴파일러가 자동으로 기본생성자를 추가해줌.
	int value;
}

class CData2{
	int value;
	
	CData2(int x){	// 매개변수가 있는 생성자
		value = x;
	}
	
	CData2(){		// 이 코드를 작성하면 오류없이 실행된다.
		
	}
	
}
