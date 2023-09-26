import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample7_1_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("n(0-12)>");
		int n = Integer.parseInt(br.readLine());
		
		int i = 0;
		int factorial = 1;
		
		do {
			i++;
			factorial *= i;
		} while(i < n);
		
		System.out.println(n + "! = " + factorial);
	}
}