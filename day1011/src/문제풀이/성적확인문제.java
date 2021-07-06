package 문제풀이;

public class 성적확인문제 {

	public static void main(String[] args) {
		String[] subject = { "컴퓨터", "국어", "수학", "영어", "체육" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		// 1. 성적이 2학기에 향상된 과목의 수를 카운트
		// 2. 성적이 1,2학기에 동일한 과목의 수를 카운트
		// 3. 성적이 1,2학기에 동일한 과목명을 프린트

		// 1. 성적이 2학기에 향상된 과목의 수를 카운트
		int plus = 0;
		for (int i = 0; i < term1.length; i++) {
			if (term1[i] < term2[i]) {
				plus++;
			}
		}
		System.out.println("2학기에 점수가 향상된 과목의 수는 " + plus);

		// 2. 성적이 1,2학기에 동일한 과목의 수를 카운트
		int same = 0;
		int loca = -1 ;
		for (int i = 0; i < term1.length; i++) {
			if (term1[i] == term2[i]) {
				same++;
				loca = i;
			}
		}
		System.out.println("1,2학기 성적이 동일한 과목의 수는 " + same);

		// 3. 성적이 1,2학기에 동일한 과목명을 프린트
//		for (int i = 0; i < term1.length; i++) {
//			if (term1[i] == term2[i]) {
//				System.out.println(subject[i]);
//			}
//		}
		//2번문제의 i가 3번에서 필요해서 for문을 다시 써도 되지만, i값을 변수에 넣어서 사용해도됨
		System.out.println(subject[loca]);
		//한계1) loca에 들어갈 값이 지금코딩에선 해당값이 1개라 가능하지만, 여러개일 경우 그 값이 다 나오지않음
		//해결방법은 sysout 구문은 for문 안으로 들어가게하거나, 누적이 되는 부품을 사용
		//배열은 사용할 수 없음=>값의 크기를 알수 없으므로!
		if (loca != -1) {
			System.out.println(subject[loca]);
		}
		else {
		System.out.println("동일한 값이 없습니다.");	
		}
		//한계2) 값이 없을 경우
		//if문으로 해결해주기 

	}
}
