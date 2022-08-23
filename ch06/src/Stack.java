
public class Stack {

	public static void main(String[] args) {
		System.out.println("main(String [] args)이 시작되었음.");
		firstMethod();
		System.out.println("main(String [] args)가 끝났습니다.");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()가 시작되었습니다.");
		secondMethod();
		System.out.println("firstMethod()가 끝났습니다.");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()가 시작되었습니다.");
		System.out.println("secondMethod()가 끝났습니다..");
	}

	

}
/*
main
firstMethod() start
secondMethod() start
secondMethod() over
firstMethod() over
main over
*/