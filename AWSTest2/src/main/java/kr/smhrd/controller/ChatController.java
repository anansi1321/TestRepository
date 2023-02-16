package kr.smhrd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ChatController {

	@RequestMapping("/chat")
	public String chat() {
		
		return "chat";
	}
	
	
	
	
}
