public class Q7_2_3 {
	public static void main(String[] args) {
		int[] arraySco1 = { 80, 90, -1, 76, 77, -1, 86, 75, 61, 73, 66 };
		int[] arraySco2 = new int[arraySco1.length];
		
		int idx2 = 0;
		for(int idx1 = 0; idx1 < arraySco1.length; idx1++) {
			if(arraySco1[idx1] == -1) {
				continue;
			}
			arraySco2[idx2] = arraySco1[idx1];
			idx2++;
		}
		
		for(int idx1 = 0; idx1 < idx2; idx1++) {
			System.out.print(arraySco2[idx1] + " ");
		}
		System.out.println();
	}
}