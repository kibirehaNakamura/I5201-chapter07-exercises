import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q7_2_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arrayCrit = { 80, 65, 50, 0 };
		String[] arrayEvalu = { "優", "良", "可", "不可" };
		int i;
		
		System.out.print("点数(0-100)>");
		int score = Integer.parseInt(br.readLine());
		
		for(i = 0; i < arrayCrit.length; i++) {
			if(arrayCrit[i] <= score) {
				break;
			}
		}
		
		System.out.println(arrayEvalu[i]);
	}
}