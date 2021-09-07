package com.mega.mvc07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //@는 어노테이션 Annotation => 상속 / 싱글톤
public class BbsController {
	
	@RequestMapping("bbs.mega") 
	//RequestMapping은 유니크해야함 중복되면 절대X
	//이 RequestMapping을 찾아주는 역할을 하는 것 = 스프링!!
	public void bbs(BbsDTO bbsDTO, String date) {
		//컨트롤러의 입력값으로 넣은 변수는 프로토타입 변수!
		System.out.println("컨트롤러에서 받음>> " + bbsDTO);
		System.out.println("컨트롤러에서 받음>> " + date);
	}
	

}
