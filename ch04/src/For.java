import java.util.*;

public class For {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("Enter the number>");
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		while (num != 0)
		{
			sum += num % 10;
			System.out.printf("sum=%3d num = %d%n", sum, num);
			
			num /= 10;
		}
		
		System.out.printf("Sum of each num: %d", sum);
			
		
	}
}
