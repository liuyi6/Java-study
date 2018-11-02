package com.luis.pattern.proxy;

public class Person implements BaseService {

	public void eating(String food) {
		System.out.println("快吃" + food);
	}

	public void wcing() {
		System.out.println("喜刷刷，喜刷刷");
	}

}
