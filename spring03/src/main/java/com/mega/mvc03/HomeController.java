package com.mega.mvc03;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //@여기서는 상속의 역할을 함
public class HomeController {
	
	@RequestMapping("in.mega")
	public void insert(MemberDTO dto) {
		System.out.println("컨트롤러 메서드 호출됨@@@@@");
		System.out.println("컨트롤러에서 받은 id" + dto.getId());
		System.out.println("컨트롤러에서 받은 pw" + dto.getPw());
		System.out.println("컨트롤러에서 받은 Name" + dto.getName());
		System.out.println("컨트롤러에서 받은 tel" + dto.getTel());
	}
	@RequestMapping("check.mega")
	public void insert2(MemberDTO dto) {
		System.out.println("컨트롤러 메서드 호출됨@@@@@");
		System.out.println("컨트롤러에서 받은 id" + dto.getId());
		System.out.println("컨트롤러에서 받은 pw" + dto.getPw());
		//컨트롤러에서 처리를 한 후, 클라이언트에게 결과를 알려주어야 한다.
		//views아래에 check.jsp로 만든다!!
	}
	@RequestMapping("get")
	public void getList() {
		
	}

	
}
