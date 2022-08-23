
public class Class_variable {

	public static void main(String[] args) {
		System.out.println("Card.width =" + Card.width);
		System.out.println("Card.height =" + Card.height);
		
		Card c1 = new Card();	// 객체 생성
		c1.kind = "Heart";		// 객체 사용, iv
		c1.number = 7;			// 객체 사용, iv
		
		Card c2 = new Card();
		c2.kind = "Spade";		// iv
		c2.number = 4;			// iv
		
		System.out.println("c1은 "+ c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height +")" );
		System.out.println("c2은 "+ c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height +")" );
		System.out.println("c1의 widhth와 height를 각각 50, 80으로 변경합니다.");
		
		Card.width = 50;	// cv
		Card.height = 80;	// cv
		
		System.out.println("c1은 "+ c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height +")" );
		System.out.println("c2은 "+ c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height +")" );
	}

}

class Card
{
	String kind;	// iv
	int number;		// iv
	
	static int width = 100;	 	// cv
	static int height = 200;	// cv
}
