package com.mega.mvc07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("insert.do")
	private void pub(ProductDTO productDTO) {

	}
}
