<<<<<<< HEAD
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
=======
package com.luis.pattern.proxy;

public class Person implements BaseService {

	public void eating(String food) {
		System.out.println("快吃" + food);
	}

	public void wcing() {
		System.out.println("喜刷刷，喜刷刷");
	}

}
>>>>>>> 3a9071c1c2c9fd0f0692dc89a4e8bb12e1bd8d44
