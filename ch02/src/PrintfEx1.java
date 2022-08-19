
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(10/3); 	// 정수 / 정수 = 정수
//		System.out.println(10.0/3);	

		// 접두사를 붙이려면 지시자 앞에 #을 붙인다.
//		System.out.printf("%d%n", 15);  // 10진수
//		System.out.printf("%#o%n", 15);	// 8진수
//		System.out.printf("%#x%n", 15);	// 16진수
//		System.out.printf("%s", Integer.toBinaryString(15));
	
//		float f = 123.456789f; // float의 정밀도는 7자리이기 때문에 이후 숫자는 의미없는 수
//		double f = 123.456789;
//		System.out.printf("%f%n", f); 
//		System.out.printf("%e%n", f); 
//		System.out.printf("%g%n", f); 
		
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
		System.out.printf("[%5d]%n", 1234567); // 지정된 숫자 이상이면 짤리지 않고 다 출력된다.
		
		double d = 1.23456789;
		System.out.printf("%14.10f%n", d);   
		
		System.out.printf("[%s]%n", "www.codechobo.com");
		System.out.printf("[%20s]%n", "www.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.10s]%n", "www.codechobo.com");
	}

}
