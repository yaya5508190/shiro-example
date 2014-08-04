package com.github.zhangkaitao.shiro.chapter16.service;

import org.junit.Test;

import com.github.zhangkaitao.shiro.chapter16.entity.User;

public class PasswordHelperTest {
	PasswordHelper ph = new PasswordHelper();
	@Test
	public void encryptPassword() {
		User user = new User();
		user.setUsername("admin");
		user.setPassword("123");
		ph.encryptPassword(user);
		System.out.println(user);
	}
}
