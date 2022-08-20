public class Increment_operators {

	public static void main(String[] args) {
		int i = 5, j = 0;
		
		
		j = ++i;
		// ++i;
		// j = i;
		System.out.printf("j = %d, i = %d%n", i, j);
		
		i = 5;
		j = 0;
		
		j = i++;
		// j = i;
		// i++;
		System.out.printf("j = %d, i = %d%n", i, j);
		}
}