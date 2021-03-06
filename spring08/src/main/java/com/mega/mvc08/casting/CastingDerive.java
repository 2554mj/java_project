package com.mega.mvc08.casting;

import com.mega.mvc08.box.볼펜;
import com.mega.mvc08.box.학용품;

public class CastingDerive {
	
	public static void main(String[] args) {
		//파생된 데이터, 참조형 변수
		//형변환(casting, 캐스팅)
		//참조형 형변환(CastingDerive)은 "상속관계에 있는 클래스간" 가능!!
		
		학용품 p = new 학용품(); //부모, 슈퍼클래스, 큼
		볼펜 b = new 볼펜(); //자식, 서브클래스, 작음
		//클래스간의 크기는 "개념"을 가지고 큰지, 작은지 판별
		
		p = b; //큼 <--자동형변환(업캐스팅)-- 작
//		b = p; //작 <--강제형변환(다운캐스팅)-- 큼
		b = (볼펜)p; //작 <--강제형변환-- 큼
		
		//CastingPrimitive(기본형)와 CastingDerive(참조형)에서 업/다운 캐스팅은 CastingDerive에만 사용됨
	}

}
