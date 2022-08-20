
public class Mathround {

	public static void main(String[] args) {
		double pi = 3.141592;       
		//double shortpi = Math.round(pi); // 3.0
		//double shortpi = Math.round(pi*1000) / 1000.0;
		//System.out.println(shortpi);
		
		double shortpi = Math.round((int)(pi*1000)) / 1000.0;
		System.out.println(shortpi);

	}

}
