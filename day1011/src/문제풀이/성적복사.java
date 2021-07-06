package 문제풀이;

public class 성적복사 {

	public static void main(String[] args) {
		String[] sub = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] term1 = { 44, 66, 22, 99, 100 };

		int[] term2 = term1.clone();
		term2[0] = 22;
		term2[2] = 88;
		
		//문1) 전체 1,2학기 성적 프린트
		System.out.println("과목명  " + "1학기  " +"2학기" );
		for (int i = 0; i < term2.length; i++) {
			System.out.println(sub[i] + "   " + term1[i] +"  " + term2[i]);
		}
		
		//문2) 1,2학기 동일한 성적 과목수
		int same = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				same++;
			}
		}System.out.println("1,2학기 동일한 성적 과목수: " + same);
		
		//문3) 1,2학기 성적 중 오른 과목수
		//문4) 1,2학기 성적 중 오른 과목명
		int up = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				up++;
				System.out.println("2학기에 오른 성적 과목명: " + sub[i]);
			}
		}System.out.println("2학기에 오른 성적 과목수: " + up);
		
	}

}
