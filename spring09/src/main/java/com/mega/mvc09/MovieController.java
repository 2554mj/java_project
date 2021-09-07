package com.mega.mvc09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {


	@RequestMapping("movie.do")
	public String movie(String mTitle, int mTicket) {
		System.out.println(mTitle);
		System.out.println(mTicket);
//		int price = Integer.parseInt(mTicket); 이 과정은 필요없음
		if (mTicket >= 10000) {
			return "pay"; 
		} else {
			return "redirect:movie.jsp";
		}
	}
	
	@Autowired
	MovieDAO dao; 

	@RequestMapping("pay.do")
	public void moviePay() {
		dao.pay();
	}

}
