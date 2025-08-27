package com.ddu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
	
	@RequestMapping(value = "/index")
	public String index() {
		
		return "index"; // 실제 실행될 서버에 있는 jsp 파일의 이름(확장자(.jsp)없이 작성)
	}
	@RequestMapping(value = "/boardList")
	public String boardList() {
		
		return "boardList"; // 실제 실행될 서버에 있는 jsp 파일의 이름(확장자(.jsp)없이 작성)
	}
	@RequestMapping(value = "/member/join")
	public String join() {
		
		return "member/joinMember"; // 하위 폴더 존재 시 폴더명 기재 후 작성
	}

}
