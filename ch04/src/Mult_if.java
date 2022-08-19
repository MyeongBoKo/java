import java.util.*;

public class Mult_if {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("Enter the number>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score >= 90)
		{
			grade = 'A';
			if (score >= 98)
			{
				opt = '+';
			}
			else if (score < 94)
			{
				opt = '-';
			}
		}
		else if (score >=80)
		{
			grade = 'B';
			if (score >= 88)
			{
				opt = '+';
			}
			else if (score < 84)
			{
				opt = '-';
			}
		}
		else if (score >= 70)
		{
			grade = 'c';
			if (score >= 78)
			{
				opt = '+';
			}
			else if (score < 74)
			{
				opt = '-';
			}
		}
		else
		{
			grade = 'D';
		}
		
		System.out.printf("Your grade is %c%c.%n", grade, opt);

	}

}
