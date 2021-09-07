package com.mega.mvc14;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao;
	
	@RequestMapping("bbslist.mega")
	public void bbslist(Model model) {//model은 db에서 가지고온 정보를 views까지 넘겨줌. select할땐 model넣어줘야함!
		List<BbsDTO> bbslist = dao.bbslist();
		model.addAttribute("bbslist", bbslist);
		System.out.println("게시글 전체 수 >> "+bbslist.size());
		//JOptionPane.showMessageDialog(null, list.size());
	}
	
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
