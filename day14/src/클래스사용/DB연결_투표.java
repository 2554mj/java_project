package 클래스사용;

public class DB연결_투표 {
	String ip ="localhost";
	String port = "3306";
	String id = "root";
	String pw = "1234";
	String table = "vote";
//	투표하기_ 4개
//	==> create
//	투표결과_1위 / 2위 / 3위/ 4위
//	==> read
	
	public void create() {
		System.out.println("투표하기");
	}
	
	public void read() {
		System.out.println("투표결과");
	}

}
