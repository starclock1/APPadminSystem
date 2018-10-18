package com.rongke.serviceInterface;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.rongke.pojo.User;

public interface ServiceInterface {
	//登录方法
	public HashMap login(User u,HttpServletRequest request);
	//注册方法
	public HashMap register(User u,HttpServletRequest request);
}
