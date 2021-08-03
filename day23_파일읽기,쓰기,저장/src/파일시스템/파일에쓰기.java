package 파일시스템;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에쓰기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try//스트림연결을 시도해봐
		{
			//1. test2.txt스트링을 file 객체로 만들어준다.
			//2. test2.txt파일과 java 프로그램간에 stream을 만들어준다.
			FileWriter file = new FileWriter("test2.txt");
			//3. stream으로 데이터를 보내면 된다.
			file.write("hello" + "\n");//"\n"=>Enter "\t"=tab
			file.write("hello2");
			file.close();//클로즈안하면 보낼 데이터가 더 있다고 인식해서 스트림이 계속열려있음.
			//반드시 클로즈해줘야함. 스트림 이용하는 모든 클래스 예)scaner
		} catch//에러가 발생하면 니가 잡아서 처리해 
		(IOException e) {
			//e.printStackTrace(); 일단삭제
			System.out.println("파일 저장하는 동안 에러가 발생함");
		}//파일을 읽어오고, 내용까지 넣을 수 있는 클래스
		
		//stream을 만드는 순간 자바에선 "어? 이거 없음어떡해? 그럼 프로그램 중단인디....나 어떡해?"
		//그래서 위험상황으로 인식해서 빨간줄이 감=> 해결방법은 해당 코드에 마우스 올림 
		//윗줄 :add throws declaration선택시 메인을 JVM에게 떠넘김 = 어차피 중지됨
		//아랫줄 :surround with try/catch선택시 catch{}부분에 에러발생시 어떻게 할것인지를 지정해줄 수 있음
		
		//<주요 패키지 위치>
		//java.io : 입출력관련 ex)File, FileWriter, OutputStream
		//java.util : 주요한 유틸리티 모음(자주사용하는것) ex)Random, Date, Scaner
		//java.net : 네트워크 관련 ex)inetAddress(ip), Socket
		//java.sql : JDBC관련(db와 관련) ex)PrepareStatement, Connection

	}

}
