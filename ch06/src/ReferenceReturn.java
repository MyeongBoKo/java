class Data3 {int x;}

public class ReferenceReturn {

	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;
		System.out.println("main() : x ="+ d.x);
		
		Data3 d2 = copy(d);
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x ="+d2.x);

	}
	
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		tmp.x = d.x;
		
		return tmp;		//메서드가 객체의 주소를 반환한다는 것을 의미한다.
	}

}
