package com.newlecture.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	/*
	 * Spring Front Controller 에서 자동으로 파라메터를 맵핑해 준다 
	 * HttpServletRequest, String, Object, Collection 다 가능 
	 * @RequestParam Annotation을 사용하면 원하는 변수명으로 맵핑 할 수 있다.
	 */
	@RequestMapping("list1")
	public String list1(HttpServletRequest req) throws ClassNotFoundException, SQLException {
		String p = req.getParameter("p");
		System.out.println("HttpRequest >> "+p );
		return "notice.list";
	}
	
	@RequestMapping("list2")
	public String list2(String p) throws ClassNotFoundException, SQLException {
		System.out.println(" 2 >> "+p);
		return "notice.list";
	}	
	
	/*
	 * @RequestParam("p")
	 * default값 초기화 @RequestParam(name="p",defaultValue = "1")
	 * 파라메터로 오는 값은 모두 문자열이며 int로 변수 선언시 SPRING에서 자동으로 형 변환해 준다.
	 * Value는 별칭이여서 name 처럼 사용 할 수 있지만 동시에 같은걸 사용하면 오류가 발생한다. @RequestParam(name="p",Value = "p")
	 * required 필수값 여부 default는 ture @RequestParam(name="p",required = true)
	 */
	@RequestMapping("list3")
	public String list3(@RequestParam(name="p",defaultValue = "1") String page) throws ClassNotFoundException, SQLException {
		System.out.println(" 3 >> "+page);
		return "notice.list";
	}		
	
	@RequestMapping("list")
	public String list() throws ClassNotFoundException, SQLException {
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		return "notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "notice.detail";
	}	
}
