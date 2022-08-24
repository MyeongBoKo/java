/*
 1. 매서드의 이름이 같아야 한다.
 2. 매개변수의 개수 또는 타입이 달라야 한다.
 3. 반환 타입은 영향 없다.
 */

/* 보기 */

/*
  int add(int a, int b) {return a + b; }
  int add(int x, int y) {return x + y; }
  매개변수의 이름만 같지 매개변수 타입이 같기 때문에 오버로딩이 아닌 코드 중복이다.
  
  int add(int a, int b) {return a + b; }
  long add(int a, int b) {return (long) a + b; }
  반환값만 다를뿐 나머지는 같기 때문에 오버로딩이 아니다.
  
  long add (int a, long b) {return a + b; }
  long add (long a, int b) {return a + b; }
  오버로딩이지만 단순히 매개변수의 순서를 바꾸었기 때문에 호출시에 어느 것을 호출해야 할지 모를때 에러가 발생할 수 있다.
 */

/*
  int add(int a, int b) {return a + b; }
  long add(long a, long b) {return a + b; }
  long add(int [] a) {		// 배열의 모든 요소의 합을 반환한다.
   		long result = 0;
   		
   		for(int i = 0; i < a.length; i++)
   				result += a[i];
   		}
   		return result;
   }
 * 
 */



public class Overloading {

	public static void main(String[] args) {
		Math3 mm = new Math3();

//		add메서드가 println메서드보다 먼저 실행된다.
//		int result = mm.add(3, 3);
//		System.out.println("mm.add(3, 3) 결과:" + result);
		
		System.out.println("mm.add(3, 3) 결과:"	 + mm.add(3, 3));
		System.out.println("mm.add(3, 3L) 결과:"	 + mm.add(3, 3L));
		System.out.println("mm.add(3L, 3) 결과:"	 + mm.add(3L, 3));
		System.out.println("mm.add(3L, 3L) 결과:"	 + mm.add(3L, 3L));

		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과:" + mm.add(a));

	}

}

class Math3 {
	int add (int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
//		result = a + b;
//		return result;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a + b;
	}
	
	long add(long a, int b) {
		System.out.print("int add(long a, int b) - ");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.print("int add(long a, long b) - ");
		return a + b;
	}
	
	int add(int [] a) {
		System.out.print("int add(int a, int b) - ");
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
	
}
