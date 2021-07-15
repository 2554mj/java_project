package 클래스사용;

import 클래스생성.Couch;
import 클래스생성.TV;

public class 내거실 {

	public static void main(String[] args) {
		TV myTv = new TV();
		//new를 하면, 멤버변수들이 heap영역에 복사된다.
		//myTv 참조형 변수에는 멤버변수들이 복사된 heap영역의 주소가 들어간다.
		myTv.ch = 7;
		//myTv안에 들어있는 주소가 연결된 ch변수에 7을 넣으라는 의미
		myTv.vol = 9;
		myTv.onOff = true;
		System.out.println("myTv의 채널은 " + myTv.ch);
		System.out.println("myTv의 볼륨은 " + myTv.vol);
		System.out.println("myTv의 전원은 " + myTv.onOff);
		//myTv.onoff =false;
		System.out.println(myTv);
		
		TV yourTv = new TV();
		yourTv.ch = 7;
		yourTv.vol = 9;
		yourTv.onOff = true;
		System.out.println("yourTv의 채널은 " + yourTv.ch);
		System.out.println("yourTv의 볼륨은 " + yourTv.vol);
		System.out.println("yourTv의 전원은 " + yourTv.onOff);
		System.out.println(yourTv);
		
		Couch couch = new Couch();
		couch.color = "yellow";
		couch.size = 10 ;
		couch.touch = "soft";
		couch.material = "가죽, 나무";
		System.out.println("couch의 색은 " + couch.color);
		System.out.println("couch의 높이는 " + couch.size);
		System.out.println("couch의 촉감은 " + couch.touch);
		System.out.println("couch의 재료는 " + couch.material);
		
		couch.lean();
		couch.up();
		

	}

}
