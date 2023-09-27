public class Sample7_3_3 {
	public enum Move { UP, DOWN, LEFT, RIGHT }
	public static void main(String[] args) {
		Move move = Move.LEFT;
		
		switch(move) {
		case UP:
			System.out.println(move + " : 上へ移動");
			break;
		case DOWN:
			System.out.println(move + " : 下へ移動");
			break;
		case LEFT:
			System.out.println(move + " : 左へ移動");
			break;
		case RIGHT:
			System.out.println(move + " : 右へ移動");
			break;
		}	// 列挙型で定義された定数しか飛んでこないので例外のdefaultを指定する必要がないのか？
	}
}