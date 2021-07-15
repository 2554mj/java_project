package 클래스사용;

import java.sql.DriverManager;

public class MemberDB {
	
	String ip ="localhost";//127.0.0.1|, localhost 알아서 내껄로 넣어줌
	String port = "3306";
	String user = "root";
	String pass = "1234";
	String table = "member";
	
	public void login(String id, String pw) {
		//회원가입시 사용한 id가 apple, pw는 1111
		if (id.equals("apple") && pw.equals("1111")) {
			System.out.println("로그인 성공!");
		}
		else {
			System.out.println("로그인 실패!");
		}
	
	}	
	public void create(String id, String pw, String name, String tel) throws Exception {
		//DB연결
		//1)연결할 mySql server정보가 필요함 : 주소, 연결(ip, port)
		//2)연결할 mySql server의 승인을 받아야함 :  id, pw
		
		
		System.out.println(ip + port +"에 연결되었습니다.");
		System.out.println("입력된 id는 " + id);
		System.out.println("입력된 pw는 " + pw);
		System.out.println("입력된 name는 " + name);
		System.out.println("입력된 tel는 " + tel);
		//JAVA와 mySql과의 연결 순서가 정해져있음.(JDBC프로그래밍)
		//Java DB Connectivity
		//==1. connector 설정, 위험하다고 빨간줄쫙 위에 마우스올리고 위에꺼선택한뒤 가운데 지우고 "throws Exception"로 수정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정 성공!!!");
		
		//==2. mysql server의 db와 연결하고 승인받기
		String url = "jdbc:mysql://" + ip + ":" + port + "/" + "shoes";
		//String url = "jdbc:mysql://" + ip + ":" + port + "/" + "DB이름";
		//jdbc:mysql://localhost:3306/shoes

		DriverManager.getConnection(url, user, pass);
		
		System.out.println("2. mySQL 서버 승인/연결 성공!!!");
		//==3. sql 문을 만들자 =>다음주에
		//==4. sql문을 mysql server에게 전송 =>다음주에
	}
	
	public void read(String id) {//검색항목을 뭘로 하느냐에 따라 ()에 입력값이 달라짐
		System.out.println("회원정보 검색 처리");
	}
	
	public void update() {
		System.out.println("회원정보 수정처리");
	}
	
	public void delete(String id) {
		System.out.println("회원탈퇴 처리");
		System.out.println(id + "님의 탈퇴가 완료되었습니다.");
	}
	
}
