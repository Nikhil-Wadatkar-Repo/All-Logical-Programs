package com.bs;

class SingletonTest {
	private static SingletonTest demo;
	private SingletonTest() {}

	static public SingletonTest getInstance() {
		if (demo == null) {
			synchronized (SingletonTest.class) {
				if (demo == null) {
					demo = new SingletonTest();
				}
			}
		}
		return demo;
	}
}

final class ImmutableTest {
	final private int id;
	final private String name;

	public ImmutableTest(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
}

public class Demo {

	public static void main(String[] args) {
		SingletonTest obj1 = SingletonTest.getInstance();
		SingletonTest obj2 = SingletonTest.getInstance();
		SingletonTest obj3 = SingletonTest.getInstance();
		System.out.println(obj1.hashCode() + " " + obj2.hashCode() + " " + obj3.hashCode());
		
		ImmutableTest test=new ImmutableTest(12, "Nana");
		
		

	}

}
