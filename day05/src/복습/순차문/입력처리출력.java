package 복습.순차문;

//제이옵션페인의 경로, 제이옵션을 걸면 경로가 자동으로 떠야함
import javax.swing.JOptionPane;


public class 입력처리출력 {

	//calss생성시 메인체크를 깜박했다면 main + ctrl + space bar
	public static void main(String[] args) {
		//1. 입력 (데이터를 가져오는 것) 지금아는건 제이옵션
		String hor = JOptionPane.showInputDialog("사각형의 가로 크기는?");
		String ver = JOptionPane.showInputDialog("사각형의 세로 크기는?");
		
		//2. 처리
		//String->int로 변환해주는 처리(망치같은애) 이건CPU가 바꾼값
		double hor_d = Double.parseDouble(hor);
		double ver_d = Double.parseDouble(ver);
		
		double result = hor_d * ver_d;
		
		
		//3. 출력 void는 결과값이 없다는 뜻 그래서 변수에 넣을 수 없음!!
		JOptionPane.showMessageDialog(null, "사각형의 넓이는" + result + "입니다.");
		
	}

}
