import java.util.*;

public class Do_while {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		System.out.println(answer);
		
		Scanner scanner = new Scanner(System.in);
		
		do
		{
			System.out.print("1과 100 사이의 정수를 입력하세요>");
			input = scanner.nextInt();
			
			if (input > answer)
			{
				System.out.printf("더 작은 수로 시도해보세요.%n");
			}
			else if (answer > input)
			{
				System.out.printf("더 큰수로 다시 시도해보세요.%n");
			}
		}
		while (input != answer);
		
		System.out.println("정답입니다.");
	}
}
			
		


