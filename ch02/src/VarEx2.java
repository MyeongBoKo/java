import javax.net.ssl.CertPathTrustManagerParameters;

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4, y =2;
		int tmp;
		
		tmp = x; // 1. x의 값을 tmp에 저장
		x = y;   // 2. y의 값을 x에 저장
		y = tmp; // 3. tmp의 값을 y에 저장
		
		System.out.println("x="+x); // +는 숫자 앞에 글자를 붙일때도 사용
		System.out.println("y="+y);
		
		
	}                      

}
