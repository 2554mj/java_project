package 상속;

public class Main {

	public static void main(String[] args) {
		Manager m = new Manager();
		
		m.name = "박매니저";
		m.address = "busan";
		m.salary = 3000;
		m.rrn = 100;
		m.bonus = 1000;
		System.out.println(m);
		
		m.test();

	}

}
