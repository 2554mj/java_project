package 이차원배열;

public class 이차원배열2 {
//이차원배열은 일차원의 결합, 일차원 배열의 길이가 다 똑같을 필요는 없음 
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		int[] arr3 = new int[4];
		//각각의 변수 5,7,6 = 18개
		
		//이차원 : int[행][열]
		int[][] arrList = new int[3][];
		//arrList 변수1개, int(3)의 length가 하나 생겨서 2개 더해줌
		arrList[0] = arr1;
		arrList[1] = arr2;
		arrList[2] = arr3;
		
		//     0  1  2  3  4
        //0	   0  0  0
		//1	   0  0  0  0  0
		//2	   0  0  0  0
		
		arrList[1][1] = 1;
		arrList[1][3] = 1;
		arrList[2][2] = 1;
		
		System.out.println(arrList[1][1]);
		System.out.println(arrList[1][3]);
		System.out.println(arrList[2][2]);
		
		System.out.println(arrList.length);
		System.out.println(arrList[0].length);
		System.out.println(arrList[1].length);
		System.out.println(arrList[2].length);
		

	}
	

}
