
public class Conditionoperator {

	public static void main(String[] args) {
		int x = 10, y = -8, z = 0;
		int x1, y1, z1;
		char x2, y2, z2;
		
		x1 = x >= 0 ?  x :  y;
		y1 = y >= 0 ? -y : -x;
		z1 = z >= 0 ?  z : -z;
		
		x2 = x1 > 0 ? '+' : (x1 == 0 ? ' ' : '-'); 
		y2 = y1 > 0 ? '+' : (y1 == 0 ? ' ' : '-');
		z2 = z1 > 0 ? '+' : (z1 == 0 ? ' ' : '-');
		
		System.out.printf("x=%c(%d)%n", x2, x1);
		System.out.printf("y=%c(%d)%n", y2, y1);
		System.out.printf("z=%c(%d)%n", z2, z1);

	}

}
