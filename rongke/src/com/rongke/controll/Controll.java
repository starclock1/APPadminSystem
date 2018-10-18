package com.rongke.controll;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rongke.pojo.User;
import com.rongke.serviceInterface.ServiceInterface;

@Controller
public class Controll {
	
	@Resource(name="se")
	private ServiceInterface si;
	

	//前端控制器，接收请求
	
	//登录
	@RequestMapping("/login.action")
	public ModelAndView login(User u,HttpServletRequest request) {
		HashMap result = new HashMap();
		result=si.login(u, request);
		ModelAndView mav=new ModelAndView();
		mav.addObject(result);
		return new ModelAndView((String)result.get("url"),"data",result);
	}
	
	//注册
	@RequestMapping("/register.action")
	public ModelAndView register(User u,HttpServletRequest request) {
		HashMap result=new HashMap();
		result=si.register(u, request);
		ModelAndView mav=new ModelAndView();
		mav.addAllObjects(result);
		return new ModelAndView((String)result.get("url"),"data",result);
	}
}	
