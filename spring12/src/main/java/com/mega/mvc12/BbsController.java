package com.mega.mvc12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao;
	
	@RequestMapping("bbs.mega")
	public void insert(BbsDTO bbsDTO) {
		System.out.println(bbsDTO);
		dao.create(bbsDTO);
	}
		
	@RequestMapping("bfid.mega")
	public void bfid(BbsDTO bbsDTO, Model model) {
		dao.read(bbsDTO);
		BbsDTO dto = dao.read(bbsDTO);
		model.addAttribute("dto", dto);
	}
		
		
		
	

}
