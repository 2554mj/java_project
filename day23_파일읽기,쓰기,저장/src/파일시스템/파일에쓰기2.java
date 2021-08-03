package 파일시스템;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에쓰기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try//스트림연결을 시도해봐
		{
			//1. test2.txt스트링을 file 객체로 만들어준다.
			//2. test2.txt파일과 java 프로그램간에 stream을 만들어준다.
			String day = JOptionPane.showInputDialog("날짜입력");
			String title = JOptionPane.showInputDialog("제목입력");
			String content = JOptionPane.showInputDialog("내용입력");
			String wether = JOptionPane.showInputDialog("날씨입력");
			FileWriter file = new FileWriter(day+".txt");
			//3. stream으로 데이터를 보내면 된다.
			file.write(day + "\n");
			file.write(title + "\n");//"\n"=>Enter "\t"=tab
			file.write(content + "\n");//"\n"=>Enter "\t"=tab
			file.write(wether + "\n");//"\n"=>Enter "\t"=tab
			file.close();//반드시 클로즈해줘야함.
			JOptionPane.showMessageDialog(null, "일기가 기록됨");
		} catch//에러가 발생하면 니가 잡아서 처리해 
		(IOException e) {
			System.out.println("파일 저장하는 동안 에러가 발생함");
		}

	}

}
