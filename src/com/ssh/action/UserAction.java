package com.ssh.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.User;
import com.ssh.service.UserService;
import com.ssh.serviceImpl.UserServiceImpl;
@Controller
@Scope("prototype")
public class UserAction  extends ActionSupport{
	@Autowired
	private UserServiceImpl userServiceImpl;
	private User u;
	public String register() throws Exception {
		// TODO Auto-generated method stub
		userServiceImpl.saveUser(u);
		return "success";
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}
	
}
