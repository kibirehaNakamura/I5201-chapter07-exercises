public class Sample7_2_3 {
	public static void main(String[] args) {
		int[] arrayScore = { 10, 20, 30, -1, 10, -1, 18 };
		int count = 0;
		int total = 0;
		double average;
		
		for(int i = 0; i < arrayScore.length; i++) {
			if(arrayScore[i] < 0) {
				continue;
			}
			total += arrayScore[i];
			count++;
		}
		average = (double)total / count;
		System.out.println("平均 = " + average);
	}
}