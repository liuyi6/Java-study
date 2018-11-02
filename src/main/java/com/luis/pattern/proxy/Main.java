package com.luis.pattern.proxy;

public class Main {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		BaseService person = ProxyFactory.newInstance(Person.class);
		person.eating("米饭");
	}
}
