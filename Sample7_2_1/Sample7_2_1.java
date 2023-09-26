import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample7_2_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final char[] arrayDiscountCode = { 'S', 'A', 'C', 'E' };
		final double[] arrayDiscountRate = { 0.17, 0.15, 0.13, 0.10 };
		int i;
		
		System.out.print("割引コード(S,A,C,E)>");
		char discountCode = br.readLine().charAt(0);
		
		for(i = 0; i < arrayDiscountCode.length; i++) {
			if(discountCode == arrayDiscountCode[i]) {
				break;
			}
		}
		
		if(i < arrayDiscountCode.length) {
			System.out.println(arrayDiscountRate[i]);
		} else {
			System.out.println("見つかりませんでした");
		}
	}
}