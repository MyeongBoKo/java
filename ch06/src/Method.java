
public class Method {

	public static void main(String[] args) {
		Math mm = new Math(); // 객체 생성 
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L); 	// Long 값이 double로 자동형변환된다.
		mm.printGugudan(9);
		int result5 = mm.max(3, 2);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("max(5L, 3L) = " + result5);

	}

}

class Math{
	void printGugudan(int dan) {
		if (!(2<= dan && dan <= 9))
			return; // 입력받는 dan 값이 2 ~ 9가 아니면 method 탈출
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d%n", i, dan, i * dan);
		}
		return;		// 반환 타입이 void이면 생략가능
	}
	long add(long a, long b) {
		long result = a + b;
		return result;
		// return a + b;
	}
	long subtract (long a, long b) { return a - b;}
	long multiply (long a, long b) { return a * b;}
	double divide (double a, double b) { return a / b;}  
	
	int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}
}
