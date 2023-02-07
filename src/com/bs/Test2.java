package com.bs;

import java.io.IOException;

class MyInfo {
	int id;
	int age;
	String name;

	public MyInfo(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		else if (obj instanceof MyInfo) {
			MyInfo info = (MyInfo) obj;
			return info.id == this.id && info.name == this.name && info.age == this.age;
		} else
			return false;
	}

	@Override
	public int hashCode() {

		return this.id ;
	}

}

public class Test2 {
	public static void main(String[] args) {
		MyInfo obj1 = new MyInfo(1, 3, "nikhil");
		MyInfo obj2 = new MyInfo(1, 1, "nikhil");
		System.out.println(obj1.hashCode() + " " + obj2.hashCode());
		System.out.println(obj1.equals(obj2));

	}

}
