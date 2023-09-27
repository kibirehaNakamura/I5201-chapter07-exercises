import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample7_3_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("順位(1-3)>");
		int rank = Integer.parseInt(br.readLine());
		String medal = "";
		
		switch(rank) {
		case 1:
			medal = "金メダル";
			break;
		case 2:
			medal = "銀メダル";
			break;
		case 3:
			medal = "銅メダル";
			break;
		default:
			medal = "メダルなし : " + rank;
			break;
		}
		
		System.out.println(medal);
	}
}