package com.ddu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/gallery")
public class GalleryController {
	
	@RequestMapping(value = "/join" )
	public String join() {
		
		return "gallery/join";
	}
	@RequestMapping(value = "/list")
	public String list() {
		
		return "gallery/list";
	}
	@RequestMapping(value = "/view")
	public String view() {
		
		return "gallery/view";
	}
}
