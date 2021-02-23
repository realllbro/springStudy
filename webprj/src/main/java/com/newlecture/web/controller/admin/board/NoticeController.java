package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {	//<bean name="adminNoticeController" class="com.newlecture.web.controller.admin.board.NoticeController" />
	
	@RequestMapping("list")
	@ResponseBody
	public String list() {
		return "list";
	}
	
	@RequestMapping("reg")
	@ResponseBody
	public String reg(String title, String content, String category, String[] foods, String food) {
		
		for(String f : foods) {
			System.out.println("f = "+f);
		}
		
		System.out.println("food : "+food);
		
		return String.format("title:%s<br>content:%s<br>category:%s", title, content, category);
	}
	
	@RequestMapping("edit")
	@ResponseBody
	public String edit() {
		return "edit";
	}
	
	@RequestMapping("del")
	@ResponseBody
	public String del() {
		return "del";
	}	
}
