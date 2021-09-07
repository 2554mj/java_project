package com.mega.mvc08.casting;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import com.mega.mvc08.MemberDTO;
import com.mega.mvc08.box.볼펜;

public class Casting1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		MemberDTO dto = new MemberDTO();
		dto.setId("hong");
		
		list.add(dto); // Object(큰) <--자동형변환-- MemberDTO(작)
		list.add("hong"); // Object(큰) <--자동형변환-- String(작)
		list.add(new Date()); // Object(큰) <--자동형변환-- Date(작)
		list.add(new Random()); // Object(큰) <--자동형변환-- Random(작)
		list.add(100); // Object(큰) <--자동형변환(업캐스팅)-- Integer(작) <--오토박싱(auto boxing)-- int(기본형)
		list.add(11.11); // Object(큰) <--자동형변환-- Double(작) <--오토박싱(auto boxing)-- double(기본형)
		//cpu의 과부하가 걸리므로 多사용하는 것은 권장하지 않음!!
		//CastingPrimitive(기본형)와 CastingDerive(참조형)에서 업/다운 캐스팅은 CastingDerive에만 사용됨
		
		System.out.println(list);
		
		Object dto2 = list.get(0); //Object
		//System.out.println(dto2.getId());
		//Object으로 업캐스팅되서 들어가면 자식클래스의 메서드 사용 불가!!
		//업캐스팅되어 Object로 들어간 객체는 원래클래스가 가지고 있던 자식에서 추가된 메서드를 쓸 수 없게 된다!!
		//부모클래스로 업캐스팅하는 경우는 자식에서 추가된 메서드를 인식하지 못한다!!
		
//		MemberDTO dto3 = list.get(0); //자식타입은 부모타입보다 작으므로 강제형변환이 필요하다!  
		MemberDTO dto3 = (MemberDTO)list.get(0); //MemberDTO(작) <--강제형변환-- Object(큰)  
		System.out.println(dto3.getId());
		
		int no = (Integer)list.get(4); //int <--오토언박싱-- Integer <--다운캐스팅-- Object
		//Integer <--다운캐스팅-- Object => 클래스와 클래스간의 형변환이므로 업,다운 사용함!, Integer를 int로 써도 됨!
		double no2 = (double)list.get(5); //double <--오토언박싱-- double <--다운캐스팅-- Object
		
		double result = no + no2;
		System.out.println(result);
		//모든클래스는 Object의 자식
		//상속은 왜하지? 원래 기능에 파생시켜 계속 기능을 붙여서 만들려고!!

	}

}
