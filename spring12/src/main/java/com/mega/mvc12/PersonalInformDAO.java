package com.mega.mvc12;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonalInformDAO {
	
	@Autowired
	SqlSessionTemplate personalinform;
	
	public void create(PersonalInformDTO informDTO) {
		System.out.println(informDTO);
		personalinform.insert("inform.add", informDTO);
	}
	public PersonalInformDTO read(PersonalInformDTO informDTO) {
		PersonalInformDTO dto = personalinform.selectOne("inform.serchOne", informDTO);
		return dto;
		
	}

}
