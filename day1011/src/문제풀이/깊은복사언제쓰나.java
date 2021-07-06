package 문제풀이;

public class 깊은복사언제쓰나 {

	public static void main(String[] args) {
		int[] term1 = {100, 88, 99, 77, 22};
		
		//지난학기 점수는 이번학기 점수와 거의 유사하다
		int[] term2 = term1.clone();
		term2[4] = 66;
	}

}
