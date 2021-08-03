package shop.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.게시판Bag;
import shop.dto.상품Bag;
import shop.dto.회원Bag;

public class 상품DAO {

	
	public 상품Bag read(String id) {
		System.out.println("전달된 id는 " + id);	
		ResultSet rs = null;
		상품Bag bag = new 상품Bag();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			String sql = "select * from product where id= ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. sql문 생성 성공!!!");
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			if (rs.next()) {
				System.out.println("검색 결과가 있음!");
				bag.setId(rs.getString("id"));
				bag.setName(rs.getString("name"));
				bag.setContent(rs.getString("content"));
				bag.setPrice(rs.getString("price"));
			}
			else {
				System.out.println("검색 결과가 없음..");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("1번에러 >> 드라이버없음!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("2-4번에러 >> DB관련된 처리하다 에러발생!");
			e.printStackTrace();		}
		return bag;
		}
	
	public ArrayList<상품Bag> read() {
		ResultSet rs = null;
		ArrayList<상품Bag> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");
			String sql = "select * from product ";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공!!!");
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			while (rs.next()) {
				System.out.println("검색 결과가 있음!");
				상품Bag bag = new 상품Bag();
				bag.setId(rs.getString("id"));
				bag.setName(rs.getString("name"));
				bag.setContent(rs.getString("content"));
				bag.setPrice(rs.getString("price"));
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
