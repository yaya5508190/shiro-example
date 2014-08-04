package com.github.zhangkaitao.shiro.chapter3;

import junit.framework.Assert;

import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class JdbcTest extends BaseTest{
	@Test
	public void testJdbcRole(){
		login("classpath:shiro-jdbc-authorizer.ini", "yx", "123");
		Subject s= subject();
		Assert.assertTrue(s.isPermitted("user:c"));
		Assert.assertTrue(s.isPermitted("+user+10"));
		Assert.assertTrue(s.isPermitted("user:i"));
		Assert.assertTrue(s.isPermitted("user:u"));
		//Assert.assertTrue(s.isPermitted("menu:view"));
		Assert.assertFalse(s.isPermitted("user:*"));
		Assert.assertTrue(s.hasRole("role1"));
		Assert.assertTrue(s.hasRole("admin"));
	}
}
