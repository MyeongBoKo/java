
public class Usual_arithmetic_conversion {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		
		int c = 1_000_000, d = 2_000_000;
		long f = (long)c*d; 
		//long f = c * d;
		// 결과값을 long타입으로 형변환을 시켰기 때문에 데이터가 충분히 저장되었다고 생각할 수 있지만, 실제로는 그렇게 출력되지 않는다.
		// c * d는 int타입이기 때문이다. 그래서 이미 값이 오버플로우가 되었기 떄문에 결과값이 이상하게 나오는 것이다.
		// 연산할 때부터 자료형의 타입을 잘 선택해서 계산을 해줘야 한다.
		System.out.println(f);
		
		
		
		
		
	}

}
