package DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDB {
	//자바에서는 db처리할 때는 DML중심으로 클래스를 만든다.
	//db연결할 때는 db를 단위로 연결한다.
	//db연결하여 데이터 처리를 하는 클래스를 만들때는 테이블 단위로 만든다.
	//테이블(entity, 개체)
	//create(insert~into values)
	//sql문은 대소문자 상관없음
	//CRUD중 C(insert)U(update)D(delete)는 아래와같이 사용 //read는 방법이 다름 
	public void create(String id, String pw, String name, String tel) throws Exception {
		//++자바와 DB연결하는 프로그램(=JDBC) 순서
		//1.JDBC Connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결성공!!");
	 
		//2.java에서 DB로 연결 : 연결할 주소 URL(ip, port, DB명), user name, password
		String url = "jdbc:mysql://localhost:3306/shoes";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		//import java.sql.Connection;경로확인
		System.out.println("2. shoes db 연결성공!");
		
		//3.sql문을 만든다.
		String sql = "insert into member values (?, ?, ?, ?)";
//		PreparedStatement => sql문 객체, 컵에 sql을 담았을때 컵과 같은 의미
		PreparedStatement ps = con.prepareStatement(sql);//con이 가져와줌
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		System.out.println("3. SQL문 연결성공!!");
//		String URL = "http://www.naver.com";
//		String file = "c:/temp/test.txt";
//		URL url = new URL(http://www.naver.com);이게 URL인지 인식을 못함 그래서 부품을 사용해줌
//		File file = new File(c:/temp/test.txt); 객체지향언어에서는 부품을 사용해서 이게
//		어떤형식인지를 인식시킴. 
				
		//4.sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공!");
		System.out.println(result);
	}//create end
	
	//==필요에따라 ()이부분만 수정해서 사용하면됨
	public void update(String id, String tel) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결성공!!");
		String url = "jdbc:mysql://localhost:3306/shoes";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. shoes db 연결성공!");
		//==필요에따라 이부분만 수정해서 사용하면됨
		String sql = "update member set tel= ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		//==필요에따라 이부분만 수정해서 사용하면됨
		ps.setString(1, tel);//set tel= ? where id = ?"; 61번줄 첫번째?값
		ps.setString(2, id);//set tel= ? where id = ?"; 61번줄 두번째?값
		System.out.println("3. SQL문 연결성공!!");
		int result = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공!");
		System.out.println(result);
	}//update end

	
	//==필요에따라 ()이부분만 수정해서 사용하면됨
	public void delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결성공!!");
		String url = "jdbc:mysql://localhost:3306/shoes";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. shoes db 연결성공!");
		//==필요에따라 이부분만 수정해서 사용하면됨
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		//==필요에따라 이부분만 수정해서 사용하면됨
		ps.setString(1, id);
		System.out.println("3. SQL문 연결성공!!");
		int result = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공!");
		System.out.println(result);
	}//delete end

}
