import java.util.*;

public class Ex2_if_esle_if {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.println("Enter the number>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score >= 90)
		{
			grade = 'A';
		}
		else if (score >= 80)  // 80 <= score && score <= 90
		{
			grade = 'B';
		}
		else if (score >= 70)
		{
			grade = 'C';
		}
		else
		{
			grade = 'D';
		}
		
		System.out.printf("The grade is %c%n", grade);
		
		

	}

}
