package 상속;

public class Person //extends Object{ => 모든클래스는 extends Object을 기본으로 상속받는다
    {
	//상태(속성)=>멤버변수
	String name;
	int age;
	
	public Person() {
	//기본생성자 : 다른 생성자메서드가 없을 때만 자동생성! 다른 생성자가 있을 땐 자동생성되지X
    //생성자 사용하는 이유 
    //1) 객체생성시 자동호출되므로, 생성할 때 자동으로 꼭 실행해주고 싶은 부분이 있을 경우
	//2) 객체생성시 입력값에 대한 제약조건을 걸고 싶은 경우
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}	
	//동작(기능)=>멤버메서드
	public void think(){
		System.out.println("생각하다");
	}
	public void tool(){
		System.out.println("도구를 이용하다");
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
