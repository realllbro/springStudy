package com.newlecture.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

public class ListController implements Controller{
	
	@Autowired
	private NoticeService noticeService;
	
	/* DI시 처리할 로직이 있으면 setter에 설정 없으면 선언시...
	@Autowired
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	*/

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("notice.list");
		//mv.setViewName("WEB-INF/view/notice/list.jsp");
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		mv.addObject("list", list);
		
		return mv;
	}

}
