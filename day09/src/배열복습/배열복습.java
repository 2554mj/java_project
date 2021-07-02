package 배열복습;

public class 배열복습 {

	public static void main(String[] args) {
		//데이터를 가지고 할 수 있는 작업의 종류
		//1.데이터 넣기 / 삭제 / 수정 / 검색(검색이 제일 중요) 
		//문법들의 모임은 라이브러리
		
		// 배열을 만들 때 값을 처음부터 알고 있는 경우, 배열은 반복문과 짝궁
		int[] num = { 100, 200, 300 };
		num[1] = 500;  
				for (int i = 0; i < num.length; i++) {
					System.out.println(num[i]);					
				} 
				for (int a : num) { 
		//foreach의 int i=정수의i로 위의 for문의 i와 다르다, 헷갈리다면 i를 다른 변수명으로 변경해서 사용해라 
					System.out.println(a);
				}
		
		// 배열을 만들 때 값을 처음에 모르고 있다가 나중에 넣는 경우
				int[] num2 = new int[3]; //{0,0,0}로 자동 초기화! 
				num2[0] = 1000;
				num2[num2.length - 1] = 1000;
				for (int i : num2) {
					System.out.println(i);
				}

	}

}
