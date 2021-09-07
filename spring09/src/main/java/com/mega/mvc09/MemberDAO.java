package com.mega.mvc09;

import org.springframework.stereotype.Repository;

//dao는 싱글톤으로 만들어주어야한다!
@Repository //@Repository 싱글톤으로 만들어준다! 싱글톤으로 만들어줄 객체가 아니면 어노테이션 달면 안됨!
public class MemberDAO {
	
	// 기능하나당 메서드하나!
	public boolean login(MemberDTO dto) {
		String dbId = "root";
		String dbPw = "1234";
		boolean result = false; //컨트롤러에 결과를 알려주기 위한 변수
		if (dto.getId().equals(dbId) && dto.getPw().equals(dbPw)) {
			result = true;
		}
		return result;
		

	}

	
	public void create() {

	}

}
