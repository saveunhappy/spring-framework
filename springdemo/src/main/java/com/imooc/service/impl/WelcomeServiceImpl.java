package com.imooc.service.impl;

import com.imooc.service.WelcomeService;

public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public void sayHello(String name) {
		System.out.println("欢迎你" + name);
	}
}
