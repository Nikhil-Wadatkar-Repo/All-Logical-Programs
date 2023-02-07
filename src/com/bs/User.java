package com.bs;

import java.util.HashMap;
import java.util.Objects;

public class User {
	int id;
	String name;

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		User user1 = new User(12, "NIkhi3");
		User user2 = new User(12, "NIkhil");

		System.out.println("Hashcode: " + user1.hashCode());
		System.out.println("Hashcode: " + user2.hashCode());
		System.out.println(user1.equals(user2));

		HashMap<User, Integer> map = new HashMap<>();
		map.put(user1, 12);
		map.put(user2, 23);
//		System.out.println(map);
		map.entrySet().stream().forEach(e -> System.out.println(e.getValue()));
		System.out.println();
		map.values().stream().forEach(System.out::println);
		System.out.println();
		map.keySet().stream().forEach(System.out::println);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

}