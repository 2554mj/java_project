package 컬렉션;

import java.util.LinkedList;

public class 대기줄컬렉션 {
	public static void main(String[] args) {
		//Queue = ArrayList와 굉장히 유사함
		
		LinkedList queue = new LinkedList();
		queue.add("홍길동");
		queue.add("김길동");
		queue.add("이길동");
		System.out.println(queue);
		for (int i = 0; i < queue.size(); i++) {
			System.out.println(queue.size());
			queue.remove();
			System.out.println(queue);
		}
	}

}
