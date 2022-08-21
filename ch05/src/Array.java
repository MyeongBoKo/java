import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int [] score;
		score = new int[5];
		// int [] score = new int[5];
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4];
		System.out.printf("tmp= %d", tmp);
		
		for(int i = 0; i<=4; i++)
		{
			System.out.printf("score[%d] = %2d%n", i, score[i]);
		}
		//System.out.println(score[5]); 
		
		for (int i = 0; i < score.length; i++)
		{
			System.out.printf("score[%d] = %2d%n", i, score[i]);
		}
		
		int[] num = { 50, 60, 70, 80, 90};
		System.out.println(num); // 참조변수를 직접 출력하면 값이 나오지 않고 타입@주소 값이 나온다.
		
		for (int i = 0; i < num.length; i++)
		{
			System.out.printf("%d ", num[i]);
		}
		
		System.out.println(Arrays.toString(num)); 
		
		char[] ch = {'a', 'b', 'c', 'd'};
		System.out.println(Arrays.toString(ch));

	}

}
