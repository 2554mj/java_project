package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import shop.dto.회원Bag;

public class 회원DAO2 {
	public void create(회원Bag bag) {
	System.out.println("전달된 id는 " + bag.getId());	
	System.out.println("전달된 pw는 " + bag.getPw());	
	System.out.println("전달된 name는 " + bag.getName());	
	System.out.println("전달된 tel는 " + bag.getTel());
    
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		String url = "jdbc:mysql://localhost:3306/shop";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shoes db연결 성공!!!");
		String sql = "insert into member values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());
		System.out.println("3. sql문 생성 성공!!!");
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println(result);
	} catch (ClassNotFoundException e) {//1단계,클래스가 없으면 어떡할래?
		System.out.println("1번에러 >> 드라이버없음!");
	} catch (SQLException e) {//2-4단계, SQL문과 관련되서 문제있으면 어떡할래?
		System.out.println("2-4번에러 >> DB관련된 처리하다 에러발생!");
	}
	}

}
