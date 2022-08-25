import java.awt.datatransfer.SystemFlavorMap;

public class Inheritance_2 {
	public static void main(String[] args) {
//		Circle c = new Circle();

//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		System.out.println("c.x = "+c.x);
//		System.out.println("c.y = "+c.y);
//		System.out.println("c.r = "+c.r);
		
		Circle c1 = new Circle();
		c1.p.x = 1;
		c1.p.y = 2;
		c1.r   = 3;
		System.out.println("c1.p.x = "+c1.p.x);
		System.out.println("c1.p.y = "+c1.p.y);
		System.out.println("c1.r = "+c1.r);
		System.out.println(c1.toString());
		System.out.println(c1);
		
		Circle c2 = new Circle();
		c2.p.x = 4;
		c2.p.y = 5;
		c2.r   = 6;
		System.out.println("c2.p.x = "+c2.p.x);
		System.out.println("c2.p.y = "+c2.p.y);
		System.out.println("c2.r = "+c2.r);
		System.out.println(c2.toString());
		System.out.println(c2);
	}
}

class Mypoint{
	int x;
	int y;
}

//class Circle extends Mypoint{	// 상속
//	int r;
//}

class Circle{
	Mypoint p; // = new Mypoint();
	int r;
	
	Circle(){
		p = new Mypoint();
	}
}




