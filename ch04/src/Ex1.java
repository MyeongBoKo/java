import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		System.out.print("Enter the number>");
		
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input == 0)
		{
			System.out.println("Number is 0");
		}
		else //(input != 0)
		{
			System.out.println("Number is not 0");
			System.out.printf("Number is %d", input);
		}
		
		

	}

}
