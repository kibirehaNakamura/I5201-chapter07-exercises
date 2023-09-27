import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice7_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int hitNumber;
		int number;
		
		hitNumber = (int)(Math.random() * 100);
		System.out.println("数当てゲーム(0～99までの数字です)");
		System.out.println("何回で当てられるか挑戦してください");
		
		while(true) {
			System.out.print("数:>");
			number = Integer.parseInt(br.readLine());
			
			if(number > hitNumber) {
				System.out.println(number + "より小さい値です");
			} else if(number < hitNumber) {
				System.out.println(number + "より大きい値です");
			} else {
				System.out.println(number + "で当たりです");
				break;
			}
		}
		System.out.println("--- プログラム終了 ---");
	}
}