package com.newlecture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

@Controller
//public class IndexController implements Controller{
//annotation 으로 변경하면서 단순히 컨트롤 클래스가 아닌 컨트롤을 담는 컨테이너 역할을 하는 클래스로 변경됨
@RequestMapping("/")
public class HomeController{
	
	@RequestMapping("index")
	public String index() {
		return "root.index";
	}
	
	@RequestMapping("index1")
	public void index1(HttpServletResponse response) throws IOException {
		PrintWriter pw = response.getWriter();
		pw.println("HttpServletResponse 담아서 리턴");
	}
	
	@RequestMapping("index2")
	@ResponseBody
	public String index2(HttpServletResponse response) {
		return "@ResponseBody 문자 그대로 전달";
	}
	
/*
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// TODO Auto-generated method stub
		
		ModelAndView mv = new ModelAndView();
		//ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("data","Hello Spring MVC~");
		
		//ViewResolver 사용전 
		//mv.setViewName("/WEB-INF/view/index.jsp");
		
		//ViewResolver 사용
		//mv.setViewName("index");		
		
		//tiles 사용
		mv.setViewName("root.index");
		
		
		return mv;
	}
*/	
}
