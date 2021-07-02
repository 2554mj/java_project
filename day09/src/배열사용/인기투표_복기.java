package 배열사용;

import java.util.Scanner;

public class 인기투표_복기 {

	public static void main(String[] args) {
	//3명의 투표값 나타내기
		//1. 투표할 수 있게 입력창 만들기 
		//2. 이름과 투표수를 넣을 공간만들기 => 배열
		//3. 입력값을 받아오고
		//4. 입력값이 3일 경우 시스템 종료
		//5. 입력값이 0,1,2일 경우 득표수가 +1 증가됨 
		//6. 결과값출력하기 - 입력값이3일때
		//7. 반복하기 => while 
		
		//2. 이름과 투표수를 넣을 공간만들기 => 배열만들기
		String[] name = {"아이유", "유재석", "BTS"};
		int[] vote = new int[3];
		
		//3. 입력값을 받아옴
		Scanner sc = new Scanner(System.in);
		
		//7. 반복하기 => while
		while (true) {
		//1. 투표할 수 있게 입력창 만들기 
		System.out.println("투표해주세요! 0)아이유 1)유재석 2)BTS 3)종료");
		System.out.println("선택번호>> ");
		//3. 받아온 입력값을 int로 변수선언
		int num = sc.nextInt();
		//4. 입력값이 3일 경우 시스템 종료
		if (num== 3) {
			System.out.println("투표를 종료합니다.");
			//6. 결과값출력하기 - 입력값이3일때
			for (int i = 0; i < vote.length; i++) {
				System.out.println(name[i] + " : " + vote[i] + "표");
			}
			System.exit(0);
		}	
		
		//5. 입력값이 0,1,2일 경우 득표수가 +1 증가됨
		vote[num]++;
		//득표할 때마다 1표득표했다고 알려주기
		System.out.println(name[num] + " 1표 득표");
		

		
		}
	}

}
