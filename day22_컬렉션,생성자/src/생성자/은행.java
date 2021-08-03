package 생성자;

public class 은행 {

	public static void main(String[] args) {
		통장 account1 = new 통장("홍길동", "990101", 10000);
		통장 account2 = new 통장("이길동", "870101", 20000);
		//다른 생성자가 클래스내에 생기지 않았다면 클래스이름과 동일한 메서드가 입력값이 기본값으로 생김
		//이를 기본생성자(default constructor)라고 함.
		//다른 생성자를 만들면 기본생성자는 없어짐. 
		System.out.println(account1);
		System.out.println(account2);
		//자바프로그램할때 DAO, DTO는 꼭사용됨.

	}

}
