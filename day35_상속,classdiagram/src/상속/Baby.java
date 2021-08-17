package 상속;

public class Baby extends Person{
	boolean young;
	
	public void protect() {
		System.out.println("보호가 필요하다");
	}

	@Override
	public String toString() {
		return "Baby [young=" + young + ", name=" + name + ", age=" + age + "]";
	}

	
	

}
