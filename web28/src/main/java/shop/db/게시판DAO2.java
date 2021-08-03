package shop.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.게시판Bag;
import shop.dto.회원Bag;

public class 게시판DAO2 {
	//코드를 다시 검토하는 것 => 코드리뷰
	//코드를 디밸롭 하기 위한 리뷰 => 코드리팩터링
	//DAO에서 리팩터를 한 결과 JDBC 1,2단계는 똑같은 코드가 반복됨 
	//new키워드로 객체생성할 때 클래스 이름과 동일한 메서드가 있으면 자동 호출되는 메서드 => 생성자
	//객체를 생성할때마다 자동 메서드를 호출하는 생성자를 이용하자
	//이 생성자 안에 넣어놓으면 객체를 생성할때마다 무조건 처리하게 할 수 있다.
	Connection con;//전역변수, 클래스아래 선언, 전역변수는 자동초기화되며 null임
	
	public 게시판DAO2() throws SQLException {
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1. connector연결 성공!!!");
				String url = "jdbc:mysql://localhost:3306/shop";
				String username = "root";
				String password = "1234";
				con = DriverManager.getConnection(url, username, password);
				//con은 전역변수로 Connection con;이렇게 생성자 밖에 선언했음
				//Connection con= DriverManager.getConnection(url, username, password);
				//이렇게 쓰면 con이 두 개로 각자 존재하는 것임.
				//con= DriverManager.getConnection(url, username, password); 
				//이렇게 수정해줘야 con에 값이 들어감
				System.out.println("2. shop db연결 성공!!!");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}

	public void create(게시판Bag bag) {
	System.out.println("전달된 id는 " + bag.getId());	
	System.out.println("전달된 title는 " + bag.getTitle());	
	System.out.println("전달된 content는 " + bag.getContent());
	System.out.println("전달된 writer는 " + bag.getWriter());
	try {
		
		String sql = "insert into board values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getTitle());
		ps.setString(3, bag.getContent());
		ps.setString(4, bag.getWriter());
		System.out.println("3. sql문 생성 성공!!!");
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println(result);
	} 
	 catch (SQLException e) {//2-4단계, SQL문과 관련되서 문제있으면 어떡할래?
		System.out.println("2-4번에러 >> DB관련된 처리하다 에러발생!");
		e.printStackTrace();
	}
	}
	
	public 게시판Bag read(String id) {
		System.out.println("전달된 no는 " + id);	
		ResultSet rs = null;
		게시판Bag bag = new 게시판Bag();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			String sql = "select * from board where id= ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. sql문 생성 성공!!!");
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			if (rs.next()) {
				System.out.println("검색 결과가 있음!");
			
				String id2= rs.getString("id");
				String title= rs.getString("title");
				String content= rs.getString("content");
				String writer= rs.getString("writer");
				System.out.println(id+" "+title+" "+content+" "+writer);
			
				bag.setId(id);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				
			}
			else {
				System.out.println("검색 결과가 없음..");
			}
			
		} catch (ClassNotFoundException e) {//1단계,클래스가 없으면 어떡할래?
			System.out.println("1번에러 >> 드라이버없음!");
			e.printStackTrace();//에러정보 자세하게 알려주는 코드
		} catch (SQLException e) {//2-4단계, SQL문과 관련되서 문제있으면 어떡할래?
			System.out.println("2-4번에러 >> DB관련된 처리하다 에러발생!");
			e.printStackTrace();//에러정보 자세하게 알려주는 코드
		}
		return bag;
		}
	
	public ArrayList<게시판Bag> read() {
		ResultSet rs = null;
		ArrayList<게시판Bag> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			String sql = "select * from board ";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공!!!");
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			//1. db 로우있어?를 여러번 => while
			//2. 가방을 만들고 => 게시판Bag
			//3. 가방에 값을 넣고 => rs.get 입력값받아와서 > bag.set가방에 넣자
			//4. list에 가방을 넣어라 => list.add(bag);
			
			while (rs.next()) {
				System.out.println("검색 결과가 있음!");
				게시판Bag bag = new 게시판Bag();
			
//				String no= rs.getString("no");
//				String id= rs.getString("id");
//				String date= rs.getString("date");
//				String title= rs.getString("title");
//				String content= rs.getString("content");
//				System.out.println(no+" "+id+" "+date+" "+title+" "+content);
//				bag.setNo(no);
//				bag.setId(id);
//				bag.setDate(date);
//				bag.setTitle(title);
//				bag.setContent(content);

//				위의 과정을 생략해서 아래와 같이 작성
				
				bag.setId(rs.getString("id"));
				bag.setTitle(rs.getString("title"));
				bag.setContent(rs.getString("content"));
				bag.setWriter(rs.getString("writer"));
								
				list.add(bag);
				
			}
			
		} catch (ClassNotFoundException e) {//1단계,클래스가 없으면 어떡할래?
			System.out.println("1번에러 >> 드라이버없음!");
			e.printStackTrace();//에러정보 자세하게 알려주는 코드
		} catch (SQLException e) {//2-4단계, SQL문과 관련되서 문제있으면 어떡할래?
			System.out.println("2-4번에러 >> DB관련된 처리하다 에러발생!");
			e.printStackTrace();//에러정보 자세하게 알려주는 코드
		}
		return list;
		}
	

}
