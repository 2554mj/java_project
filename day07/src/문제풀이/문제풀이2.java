package 문제풀이;

public class 문제풀이2 {

	public static void main(String[] args) {
		//문1)1부터 1000까지 중 3씩 점프해 더해주세요.
		//더한 값이 100이 넘으면 더하기를 종료
		//5의 배수는 더하지 않습니다
		int sum1 = 0;
		int count = 0;
		for (int i = 1; i <= 1000; i = i + 3) {
			
			if (sum1 > 100) {
				break;//for문 종료
			}
			
			if (i % 5 == 0) {
				continue; //이 조건에 맞는 경우만 제외하고 for문은 계속 돈다. 
			}
			sum1 = sum1 + i;
			count++;//몇번 계산됐는지 궁금하다면 
			
		} System.out.println(sum1);	 				
	      System.out.println(count);	 				
			
		
	}

}
