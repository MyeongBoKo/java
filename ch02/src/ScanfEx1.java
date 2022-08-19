import java.util.*;// 1. import문 추가

public class ScanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. Scanner클래스의 객체 생성
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt(); // 입력받은 수를 num에 저장하고
//		int num2 = scanner.nextInt();// 입력받은 수를 num2에 저장한 후에 
//		System.out.println(num);     // 화면에 num 출력
//		System.out.println(num2);	 // 화면에 num2 출력	

		// 행단위로 받는 방법(값이 여러개, 숫자 문자열 또는 실수가 섞여있을때 사용한다.)
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println(num);
	}

}
