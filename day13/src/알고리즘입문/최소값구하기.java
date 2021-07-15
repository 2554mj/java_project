package 알고리즘입문;

public class 최소값구하기 {

	public static void main(String[] args) {
		// 많은 양의 데이터를 정렬/검색하는 경우 배열에 넣어줘라!
		int[] s = { 90, 80, 20, 60, 70 };

		// 전체를 n번 순회하면서 해당인덱스까지의 최소값을 변수하나를 정해서 넣어두는 알고리즘
		int min = 90;// 변수초기화에 0을 쓰면x, 데이터를 정렬/검색할때는 초기값에 배열의 첫번째값을 넣는다
		for (int i = 1; i < s.length; i++) {// int i = 1; 1로변경, 0번은 할필요 없으므로
			if (s[i] < min) {// 해당 인덱스에 들어있는 값이 min에 넣어둔 값보다 작으면
				// min의 값을 변경 -> 해당 인덱스의 값으로
				min = s[i];

			}
		}
		System.out.println("최소값은 " + min);
		
	

	}

}
