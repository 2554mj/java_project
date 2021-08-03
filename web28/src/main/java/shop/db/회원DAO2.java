package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.회원Bag;

public class 회원DAO2 {
	public int create(회원Bag bag) {
	System.out.println("전달된 id는 " + bag.getId());	
	System.out.println("전달된 pw는 " + bag.getPw());	
	System.out.println("전달된 name는 " + bag.getName());	
	System.out.println("전달된 tel는 " + bag.getTel());
    
	int result = 0; //메서드 안에서 선언된 변수로, 지역변수 => 초기화 해줘야함
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
		result = ps.executeUpdate();
		//같은이름의 변수를 2개쓸 수 없음
		//int result = ps.executeUpdate(); => result = ps.executeUpdate(); 
		System.out.println("4. sql문 전송 전송");
		System.out.println(result);
	} catch (ClassNotFoundException e) {//1단계,클래스가 없으면 어떡할래?
		System.out.println("1번에러 >> 드라이버없음!");
		e.printStackTrace();//에러정보 자세하게 알려주는 코드
	} catch (SQLException e) {//2-4단계, SQL문과 관련되서 문제있으면 어떡할래?
		System.out.println("2-4번에러 >> DB관련된 처리하다 에러발생!");
		e.printStackTrace();//에러정보 자세하게 알려주는 코드
	} 
	return result;
	}//create end
	
	public int update(회원Bag bag) {
		System.out.println("전달된 id는 " + bag.getId());	
		System.out.println("전달된 name는 " + bag.getName());	
		System.out.println("전달된 tel는 " + bag.getTel());
		int result = 0; 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			String sql = "update member set tel=?, name=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) {//1단계,클래스가 없으면 어떡할래?
			System.out.println("1번에러 >> 드라이버없음!");
		} catch (SQLException e) {//2-4단계, SQL문과 관련되서 문제있으면 어떡할래?
			System.out.println("2-4번에러 >> DB관련된 처리하다 에러발생!");
		}
		return result;
		}
	
	public int delete(회원Bag bag) {
		System.out.println("전달된 id는 " + bag.getId());	
		int result=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			String sql = "delete from member where id= ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) {//1단계,클래스가 없으면 어떡할래?
			System.out.println("1번에러 >> 드라이버없음!");
		} catch (SQLException e) {//2-4단계, SQL문과 관련되서 문제있으면 어떡할래?
			System.out.println("2-4번에러 >> DB관련된 처리하다 에러발생!");
		}
		return result;
		}
	
	public 회원Bag read(String id) {
		System.out.println("전달된 id는 " + id);	
		ResultSet rs = null;
		회원Bag bag = new 회원Bag();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			String sql = "select * from member where id= ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. sql문 생성 성공!!!");
//			result = ps.executeUpdate();=>CUD일때만 사용 read는 테이블형태의 결과값이 필요
//			이런 형식을 담아오는 부품은 executeQuery, 타입부품은 ResultSet
			
//			데이터값을 가지고오고싶다면 rs를 사용하지않고 DTO를 사용함.
//			자바에서 데이터를 묶어서 가지고오거나 내보낼땐 DTO를 쓰기로 약속했기때문에!
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
//			System.out.println("검색결과는 >> " + rs.next());
//			rs.next()로우에 값이 있는지 각 로우별로 확인해주는 부품 값이 있으면 true, 없으면 false
			
//			if문을 사용하고싶다면, 위의 시스아웃 rs.next()을 주석처리해야함. 위에 코드가 살아있으면
//			아래 if문이 두번째 로우의 값이 있는지를 확인하게됨.
	
			if (rs.next()) {
				System.out.println("검색 결과가 있음!");
				String id2= rs.getString(1);//getString("id")소괄호에 컬럼명을 넣어도됨
				String pw= rs.getString(2);
				String name= rs.getString(3);
				String tel= rs.getString(4);
				System.out.println(id2+" "+pw+" "+name+" "+tel);
				bag.setId(id2);
				bag.setTel(tel);
				bag.setName(name);
				bag.setTel(tel);
				
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
	
	public ArrayList<회원Bag> read() {
		ResultSet rs = null;
		//가방을 넣어줄 컨테이너를 하나 만들어주자=>ArrayList
		//자바파일자동임포트 : Ctrl+Shift+o
		ArrayList<회원Bag> list = new ArrayList<회원Bag>(); 
		//뒤에 ArrayList<회원Bag> 또는 ArrayList<>이렇게 사용가능
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			String sql = "select * from member";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공!!!");
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			while (rs.next()) {//row개수만큼 반복함
				System.out.println("검색 결과가 있음!");
				//가방을 만들어서 table에서 하나의 row를 꺼내준 다음 가방에 넣어야함.
				회원Bag bag = new 회원Bag();
				String id2= rs.getString(1);
				String pw= rs.getString(2);
				String name= rs.getString(3);
				String tel= rs.getString(4);
				//꺼내와서
				System.out.println(id2+" "+pw+" "+name+" "+tel);
				bag.setId(id2);
				bag.setTel(tel);
				bag.setName(name);
				bag.setTel(tel);
				//가방에 넣고 => 컨터이너(ArrayList)에 넣어줘야함
				list.add(bag);
				//row개수만큼 반복해야함
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
