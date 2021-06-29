package 문제풀이;

public class 정리문제 {

	public static void main(String[] args) {
		String food = "떡볶이" + "우동" + "짜장" + "집밥";
		
		switch (food) {
		case "떡볶이":
			System.out.println("분식집으로");
			break;
		case "우동":
			System.out.println("일식집으로");
			break;
		case "짜장":
			System.out.println("중국으로");
			break;

		default:
			System.out.println("집으로!");
			break;
		}
		
		String sn = "900101-17777777";
		//언어에서는 0부터 숫자를 셈
		//sn.charAt(7);//주민번호중 성별부분인 '1'을 가져옴
		char gender = sn.charAt(7);

		if (gender == '1' || gender == '3') {
			System.out.println("남자");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여자");
		} else {
			System.out.println("잘못입력되었습니다. 다시입력해주세요.");
		}
					
		switch (gender) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("잘못입력되었습니다. 다시입력해주세요.");
			break;
		}
		
		
		
	}

}
