package 조건문;

import javax.swing.JOptionPane;

public class 조건문2 {

	public static void main(String[] args) {
		//1. 입력
		//데이터를 입력 받아서 처리해보세요.
		String data = JOptionPane.showInputDialog("당신의 점수를 입력하세요.");
		int jumsu = Integer.parseInt(data);
		
		//2. 처리
		String result = null; //변수선언: 램에 공간이 할당 타입+이름
		//램에 찌거기(=쓰레기)가 많은 상태로 변수선언이 되어서 컴파일(=번역오류) 에러가 뜸. 
		//그래서 깨끗하게 비운 뒤 선언을 하는 것이 좋음. 예) string=null, int=0
		//정리하면 처음에 공간을 할당할 때 쓰레기 값이 들어있어서 프린트와 연산이 불가능
		//이렇게 공간을 초기에 깨끗히 하는 작업 = 변수의 초기화
				
		if (jumsu >= 90) {
			result = "A학점";
	} else if (jumsu >= 80) {
		result = "B학점";
		
	} else if (jumsu >= 70) {
		result = "C학점";
    } else  {
		result = "F학점";
		
	}
		
		
		//3. 출력
		JOptionPane.showMessageDialog(null, "당신의 학점은 " + result + "입니다.");
	}

}
