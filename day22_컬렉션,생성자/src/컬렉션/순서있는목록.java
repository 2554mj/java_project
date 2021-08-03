package 컬렉션;

import java.util.ArrayList;

import javax.swing.JFrame;

public class 순서있는목록 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();//<>에는 동일한 타입을 넣는다면 넣어주면 됨(나중에)
		list.add("홍길동");
		list.add(100);//기본형인경우에 오브젝자리에 들어가려면 기본형->클래스변환->Object로 처리해줌
		list.add(22.22);
		list.add(true);
		list.add('남');
		list.add(new JFrame());
		System.out.println(list.size());
		System.out.println(list);
		//주소가 찍여야하지만, 우리 넣은값이 나오도록 toString이 오버라이드되어있다.
		System.out.println(list.get(0));
		System.out.println(list.get(5));
		
		list.add("목요일");//크기를 자유자재로 조절가능
		System.out.println(list.size()); //7
		
		list.remove(5);//리스트의 위치값(=인덱스)으로 remove(제거)  
		System.out.println(list.size()); //6
		
		list.remove("홍길동");//리스트의 해당값으로 remove(제거)
		System.out.println(list.size()); //5
		System.out.println(list);//인덱스값이 바뀜
		list.add(0, "김길동");//0번 앞에 김길동을 add
		System.out.println(list);
		list.set(0, "홍길동");//0번 자리에 홍길동으로 데이터를 바꿔
		System.out.println(list);
		
		list.remove(new Integer(100));//해당값이100이므로 인덱스인지 해당값인지 모름(제거)
		System.out.println(list.size()); //4
		
		list.remove(new Character('남'));//해당값이100이므로 remove(제거)
		System.out.println(list.size()); //3
	}

}
