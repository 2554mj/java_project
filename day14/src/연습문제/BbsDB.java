package 연습문제;

public class BbsDB {	
	String ip ="localhost";
	String port = "3306";
	String id = "root";
	String pw = "1234";
	String table = "member";
	
	public void creat(String title, String input) {
		System.out.println("입력된 제목은>> " + title);
		System.out.println("입력된 내용은>> " + input);
	}
	
	public void delete(String title) {
		System.out.println(title + " 게시글이 삭제되었습니다.");
	}
	
}
