package com.rongke.serviceImpl;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.rongke.daoInterface.DaoInterface;
import com.rongke.pojo.User;
import com.rongke.serviceInterface.ServiceInterface;

@Service("se")
public class ServiceImpl implements ServiceInterface{
	
	//注入dao接口对象
	@Resource(name="re")
	private DaoInterface di;
	
	@Override
	public HashMap login(User u, HttpServletRequest request) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		User user=di.DaoLogin(u);
		map.put("user", user);
		map.put("mess","登录成功");
		map.put("url", "admin");
		return map;
	}

	@Override
	public HashMap register(User u, HttpServletRequest request) {
		// TODO Auto-generated method stub

		HashMap map=new HashMap();
		di.DaoRegister(u);
		map.put("mess","注册成功");
		map.put("url","login");
		return map;
	}
	
}
