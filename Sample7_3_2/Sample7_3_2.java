import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample7_3_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("(y/n)>");
		char ans = br.readLine().charAt(0);
		
		switch(ans) {
		case 'y':
			/* breakなし */
		case 'Y':
			System.out.println("YES");
			break;
		case 'n':
			/* breakなし */
		case 'N':
			System.out.println("NO");
			break;
		default:
			break;
		}
	}
}