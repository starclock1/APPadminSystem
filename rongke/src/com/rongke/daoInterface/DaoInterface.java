package com.rongke.daoInterface;

import org.springframework.stereotype.Repository;

import com.rongke.pojo.User;


@Repository("re")
public interface DaoInterface {
	
	//登录方法
	public User DaoLogin(User u);
	//注册方法
	public void DaoRegister(User u);
}
