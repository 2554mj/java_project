package shop.dto;

public class 회원Bag {
	//접근제어자에 따라 이 변수는 다른 패키지에서 접근여부가 결정됨
	//defalt(안붙은거) 접근제어자 => 같은패키지에서만 사용가능 
	//public String id; => 모든 패키지에서 접근가능
	//private String id; => 이 클래스만 접근가능(밖에서는 접근 불가능)
	private String id;
	private String pw;
	private String name;
	private String tel;
	//이 변수는 멤버변수, 클래스 바로 아래 선언됨
	//클래스 전역에서 사용가능
	//전역변수(Global):자동초기화 O, 참조형인 경우 nall로 초기화됨
	//지역변수(Local):자동초기화 X
	public void setId(String id) {
		this.id = id;
	}//이 메서드를 가지고 있어야지만 값을 넣을 수 있어, 메서드를 호출할 수 없다면
	//서버의 램에 저장된 변수에 접근을 못함, 중요한 정보를 열려있는 서버 램에
	//접근해서 아무나 가져가면 안되니까
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	//모든 과정은 자동으로 자바에서 이렇게 만들어 놓았음
	//값을 넣을 때는 set변수명() 예)setID()
	//값을 꺼낼 떄는 get변수명() 예)getID()
	//getters/setters
	@Override
	public String toString() {
		return "회원Bag [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	

}
