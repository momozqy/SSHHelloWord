package com.xiaoyu.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xiaoyu.model.MessageStore;
import com.xiaoyu.model.Person;
import com.xiaoyu.service.imp.HelloServiceImp;

public class HelloAction extends ActionSupport {
	/**
	 * 默认的序列号
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private HelloServiceImp helloService;

	public HelloServiceImp getHelloService() {
		return helloService;
	}

	public void setHelloService(HelloServiceImp helloService) {
		this.helloService = helloService;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws Exception {
		Person p = new Person();
		p.setUsername(getUsername());
		p.setPwd("1234566789");
		p.setId(1);
		// 获得web的上下文
		ActionContext ac = ActionContext.getContext();
		if (helloService.checkUser(p)) {
			Integer counter = (Integer) ac.getApplication().get("counter");
			if (counter == null)
				counter = 1;
			else
				counter++;
			ac.getApplication().put("counter", counter);
			return SUCCESS;
		}
		return ERROR;
	}

}
