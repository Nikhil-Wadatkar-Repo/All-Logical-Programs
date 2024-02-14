package com.bs.factory;

public class DetailsFactory {

	public static MyDetails getInstance(String name) {
		if (name.equals("Ankur"))
			return new AnkurDetails();
		else if (name.equals("Nikhil"))
			return new NikhilDetails();
		return new DhanuDetails();
	}
}
