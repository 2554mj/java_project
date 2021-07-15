package 클래스사용;

public class DB연결 {
	//스윙이 메인을 가짐
	//1. DB생성, 테이블생성=>mySql
	//2. 테이블에 데이터넣음 = 데이터 조작 (CRUD:Create, Read, Update, Delete)
	//DB작업하는 class는 테이블당 1개씩
	String ip ="localhost";//127.0.0.1|, localhost 알아서 내껄로 넣어줌
	String port = "3306";
	String id = "root";
	String pw = "1234";
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
	public void create(String id, String pw, String name, String tel) {
		System.out.println(ip + port +"에 연결되었습니다.");
		System.out.println("회원가입처리");
	}
	
	public void read(String id) {//검색항목을 뭘로 하느냐에 따라 ()에 입력값이 달라짐
		System.out.println("회원정보 검색 처리");
	}
	
	public void update() {
		System.out.println("회원정보 수정처리");
	}
	
	public void delete(String id) {
		System.out.println("회원탈퇴 처리");
	}
	
}
