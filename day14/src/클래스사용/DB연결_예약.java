package 클래스사용;

public class DB연결_예약 {
	String ip = "localhost";
	String port = "3306";
	String id = "root";
	String pw = "1234";
	String table = " reservation";
//	예약확인_이름/생년월일/핸드폰
//	==> read

	public void read() {
		System.out.println("예약정보 검색 처리");
	}

}
