package com.mega.mvc14;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//dao는 싱글톤으로 만들어주어야한다!
@Repository //@Repository 싱글톤으로 만들어준다! 싱글톤으로 만들어줄 객체가 아니면 어노테이션 달면 안됨!
public class MemberDAO {
	//주소를 넣을 수 있는 방법은 2가지!
	//@Inject => 클래스명
	//@Autowired => 변수의 타입명 
	//아래와 같은 상황엔
	//SqlSessionTemplate, mybatis, 주소1 
	//SqlSessionTemplate, mybatis2, 주소2
	//변수의 타입명이 같으므로 클래스명으로 주소를 불러올 수 있는 @Inject을 써야 제대로 주소를 불러올 수 있음!
	
	//@Inject("mybatis") 
	@Autowired
	SqlSessionTemplate mybatis;
	
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

	
	public void create(MemberDTO memberDTO) {
		mybatis.insert("member.create", memberDTO);
	}

	public MemberDTO read(MemberDTO memberDTO) {
		MemberDTO dto = mybatis.selectOne("member.one", memberDTO);
		return dto;
	}

	public List<MemberDTO> list() {
		List<MemberDTO> list = mybatis.selectList("member.all");
		return list;
	}
	
	public int delete(MemberDTO memberDTO) {
		int result = mybatis.delete("member.delete", memberDTO);
		return result;
	}

}
