package com.imooc.entity.factory;

import com.imooc.entity.User;

//静态工厂调入
public class StaticFactory {
	//静态的方法，返回User对象
	public static User getUser(){
		return new User();
	}
}
