package mini_original;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Page1DAO {
	public String[] read(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결성공!!");
		
		String url = "jdbc:mysql://localhost:3306/play";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db 연결성공!");
		
		String sql = "select * from reservation where idid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문 생성 성공!!");
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공!");
		
		
		String[] arr = new String[4]; 
		
		if (rs.next()) {
			String idid = rs.getString(1);
			String titleid = rs.getString(2);
			String num = rs.getString(3);
			String booking = rs.getString(4);
			//System.out.println(idid +" "+ titleid +" "+ num +" "+ booking);
			
			arr[0] = idid;
			arr[1] = titleid;
			arr[2] = num;
			arr[3] = booking;
		}
		return arr;
	}

}
