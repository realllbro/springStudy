package com.newlecture.web.controller.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@RestController("apiNoticeController") //@RestController 을 사용하게 하면 따로 지정하지 않아도 Body로 리턴 
@RequestMapping("/api/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public String list() {
		return "한글 테스트 notice list";
		
		//NoticeController noticeController = new NoticeController
		//<bean id="noticeController" class-".......NoticeController">
		
	}
	
	@RequestMapping("list2")
	public List<Notice> list2() throws ClassNotFoundException, SQLException {
		
		List<Notice> list = service.getList(1, "TITLE", "");
		for(Notice obj: list) {
			System.out.println(obj.getContent());
		}
		return list;
	}	
}
