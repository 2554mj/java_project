package 이차원배열;

import java.util.Random;

public class 이차열배열_랜덤 {

	public static void main(String[] args) {
        Random r = new Random();
        int[][] a = new int[4][5];
        
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=r.nextInt(100);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
