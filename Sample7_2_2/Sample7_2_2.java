import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample7_2_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arrayHit = {{ 50, 78 },
		                    { 86, 94, 14 },
		                    { 16, 99, 63, 83, 48 },
		                    { 57, 89, 75, 59, 74 }};
		int hit = 0;
		
		System.out.print("くじ番号(0-99)>");
		int lot = Integer.parseInt(br.readLine());
		
		exitloop:
		for(int i = 0; i < arrayHit.length; i++) {
			for(int j = 0; j < arrayHit[i].length; j++) {
				if(lot == arrayHit[i][j]) {
					hit = i + 1;
					break exitloop;
				}
			}
		}
		
		if(0 < hit) {
			System.out.println(hit + "等");
		} else {
			System.out.println("はずれ");
		}
	}
}