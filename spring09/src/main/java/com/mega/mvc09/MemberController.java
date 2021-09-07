package com.mega.mvc09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller 어노테이션을 해주면 싱글톤 객체, 스프링에 컨드롤러로 등록
@Controller
public class MemberController {

	@Autowired
	MemberDAO dao; // 스프링이 만들어놓은 싱글톤 객체의 주소를 넣어준다.

	// 주소하나당 메서드하나!
	@RequestMapping("login.mega")
	public String login(MemberDTO memberDTO) {
		// 컨트롤러의 메서드내에 선언된 파라메터는 무조건 프로토타입으로 만들어진다.
		System.out.println(memberDTO);
		System.out.println("싱글톤으로 만들어진 주소>>" + dao);
		boolean result = dao.login(memberDTO);
		if (result) {
			return "ok"; // views/ok.jsp
		} else {
			return "no"; // views/no.jsp
		}
	}

	@RequestMapping("check.mega")
	public String check(String nick) {
		System.out.println(nick);

		String dbNick = "superman";
		if (nick.equals(dbNick)) {
			return "super";
		} else {
			return "common";
		}
	}
	
	@RequestMapping("password.mega")
	public String pass(String pass) {
		System.out.println(pass);
		if (pass.equals("1234")) {
			return "pass";
		} else {
			return "redirect:index.jsp"; 
			//view로 가지 않고,webapp밑의 파일을 불러와야함(클라이언트가 요청해야함)
			//response.sendRedirect("index.jsp") 
		}
	}

}
//어노테이션 종류 -> 클래스 위에 어노테이션달아주면 싱글톤으로 만들어주는 역할
//@Controller:(클래스 위)싱글톤객체 생성, 스프링에 컨트롤러로 등록
//@Repository:(클래스 위)싱글톤객체 생성, 스프링에 모델로 등록(db처리 클래스로 등록)
//@Autowired:(변수 위)싱글톤객체 생성 된 것 중에 해당타입의 객체 주소를 넣음(데이터타입을 가지고 찾음)
//@RequestMapping:(메서드 위) 주소랑 메서드를 묶어주는 역할, 요청한 주소와 맵핑되는 것을 찾아서 아래 정의된 메서드를 호출 
