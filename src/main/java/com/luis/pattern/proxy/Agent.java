package com.luis.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理实现类 Title: Agent
 * 
 * @author luis 2018年11月3日
 */
public class Agent implements InvocationHandler {

	private BaseService obj;

	public Agent(BaseService param) {
		this.obj = param;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if ("eating".equals(method.getName())) {
			wash();
			method.invoke(obj, args);
		} else {
			method.invoke(obj, args);
			wash();
		}
		return null;
	}

	/**
	 * 次要业务，降低耦合
	 */
	public void wash() {
		System.out.println("记得洗手。。。");
	}

}
