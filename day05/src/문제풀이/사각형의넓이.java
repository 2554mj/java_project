package 문제풀이;

//제이옵션페인의 경로, 제이옵션을 걸면 경로가 자동으로 떠야함
import javax.swing.JOptionPane;


public class 사각형의넓이 {

	//calss생성시 메인체크를 깜박했다면 main + ctrl + space bar
	public static void main(String[] args) {
		//1. 입력 (데이터를 가져오는 것) 지금아는건 제이옵션
		String hobby = JOptionPane.showInputDialog("당신의 취미는?");
		String when = JOptionPane.showInputDialog("언제하시나요?");
		String time = JOptionPane.showInputDialog("몇 시간이나 하시나");
		
		//2. 처리를 그냥 냅두면 CPU가 할일이 많음 그래서 1.변수에 넣거나 2.출력(sysout)함.
		String result = when + "에" + hobby + "을(/를) 하시는 군요!";
		//String->int로 변환해주는 처리(망치같은애) 이건CPU가 바꾼값
		int time2 = Integer.parseInt(time);
		if (time2 >= 3) { //비교연산자의 결과는 항상 boolean(논리데이터,true/false)
			//조건이 true일 때 실행되는 부분
			JOptionPane.showMessageDialog(null, "아주 많이 하셨군요");
					} 
		else {
            //조건이 false일 때 실행되는 부분
			JOptionPane.showMessageDialog(null, "보통으로 하셨군요");
		}
		
		
		//3. 출력 void는 결과값이 없다는 뜻 그래서 변수에 넣을 수 없음!!
		JOptionPane.showMessageDialog(null, result);
		
	}

}
