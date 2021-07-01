package 누적연습;

public class 반복조건 {

	public static void main(String[] args) {
		//문1) 1 ~ 10 중 3의 배수만 더하기, 배수나 짝홀수는 나머지 연산자를 이용
		int sum1 = 0;
		for (int i = 1; i < 10; i++) {
			if (i % 3 == 0) {
				sum1 = sum1 + i;
			}//if			
		}//for 
		System.out.println(sum1);
		
		System.out.println("=============");
		//문1) 1 ~ 10 중 3의 배수를 제외하고 더하기, 더한 값이 < 20
				int sum2 = 0;
				for (int i = 1; i < 10; i++) {
					if (i % 3 == 0) {
						continue; //if에 대한 반복은 계속하지만 조건을 맞는 경우 아래의 코드 실행X
						//즉 if문 조건에 맞는 경우는 제외하라는 뜻
					}//if	
					if (sum2>20) {
						System.out.println("20보다 합이 크므로 stop!");
						break; //for문에 대한 브레이크, if문은 자체적으로 끝남
											}
					sum2 = sum2 + i;
				}//for 
				System.out.println(sum2);

	}

}
