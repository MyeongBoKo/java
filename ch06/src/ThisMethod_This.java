/*
 this()
 생성자의 이름으로 클래스이름 대신 this를 사용한다.
 생성자에서 다른 생성자 호출할 때 사용
 다른 생성자 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.
 */

/*
 this - 인스턴스 자기 자신을 가리킨다. 인스턴스의 주소가 저장되어 있다. 모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재한다.
 */

public class ThisMethod_This {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		
		
		System.out.println("c1의 color=" + c1.color + ", c1의 gearType=" + c1.gearType + ", c1의 door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", c2의 gearType=" + c2.gearType + ", c2의 door=" + c2.door);
	}
}



class Car2{
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("white", "auto", 4);		// Car(String color, String gearType, int door)를 호출
	}
	
	Car2(String color){
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;				// this.~ 인스턴스변수, color은 지역변수
		this.gearType = gearType;
		this.door = door;
		
	
	}
}	