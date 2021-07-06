package 문제풀이;

public class null_pointer_exception {

	public static void main(String[] args) {
		//null pointer exception : 공간만 만들어놨고 아직 아무런 작업도 안된상태
		
		String s = null;
		System.out.println(s.charAt(0));
		
		String[] a = new String[10]; 
		//new를 하면 무조건 주소가 생김
		//즉 널포인트익셉션이 뜨면 new를 넣어주면 대부분 해결
		//기본형은 값이들어가고, 참조형은 null
		System.out.println(a[0].charAt(0));

	}

}
