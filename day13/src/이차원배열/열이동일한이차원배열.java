package 이차원배열;

public class 열이동일한이차원배열 {

	public static void main(String[] args) {
		//값을 알고있는 이차배열
		int[][] n2 = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 } 
				}; 
				for (int i = 0; i < n2.length; i++) {// 행을 찍음
					for (int j = 0; j < n2[i].length; j++) {
						System.out.print(n2[i][j] + " ");
					}
					System.out.println();
					}		
				

		//값을 모를때 이차배열
		int[][] n1 = new int[3][4];
		System.out.println("2차원 배열의 행의 개수 :" + n1.length);
		System.out.println("0행의 배열의 열의개수 :" + n1[0].length);
		System.out.println("1행의 배열의 열의개수 :" + n1[1].length);
		System.out.println("2행의 배열의 열의개수 :" + n1[2].length);

		for (int i = 0; i < n1.length; i++) {// 행을 찍음
			for (int j = 0; j < n1[i].length; j++) {
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();

		}
	}

}
