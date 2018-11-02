package com.luis.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyFactory {

	@SuppressWarnings("rawtypes")
	public static BaseService newInstance(Class classFile) throws InstantiationException, IllegalAccessException {
		BaseService base = (BaseService) classFile.newInstance();
		InvocationHandler agent = new Agent(base);
		Class classArray[] = { BaseService.class };
		BaseService admin = (BaseService) Proxy.newProxyInstance(classFile.getClassLoader(), classArray, agent);
		return admin;
	}
}
