package com.mega.mvc12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonalInformController {
	
	@Autowired
	PersonalInformDAO dao;
	
	@RequestMapping("join.gigabox")
	public void insert(PersonalInformDTO informDTO) {
		System.out.println(informDTO);
		dao.create(informDTO);
	}
	
	@RequestMapping("piserch.gigabox")
	public void piserch(PersonalInformDTO informDTO, Model model) {
		dao.read(informDTO);
		PersonalInformDTO dto = dao.read(informDTO);
		model.addAttribute("dto", dto);
	}
}
