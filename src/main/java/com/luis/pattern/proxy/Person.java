package com.luis.pattern.proxy;

/**
 * 主要业务实现类
 * Person.java
 * @author luis
 * 2018年11月2日
 */
public class Person implements BaseService {

	public void eating(String food) {
		System.out.println("快吃" + food);
	}

	public void wcing() {
		System.out.println("喜刷刷，喜刷刷");
	}

}
