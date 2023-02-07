package com.bs.roughWork.collectionCoversion;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapDemo {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("10", "ankur", "Morshi"),
                new User("15", "nikhil", "Jitapur"),
                new User("98", "nana", "Warud"),
                new User("36", "nana", "Nagpur")
        );

//        Map<Integer, String> map1 = users.stream().collect(Collectors.toMap(User::getId, User::getName));
//        System.out.println(map1);
        Map<String, String> map2 = users.stream().collect(Collectors.toMap(User::getName,User::getCity ,(oldValue,newValue)-> oldValue, LinkedHashMap::new));
        System.out.println(map2);
    }
}

class User {
    private String id;
    private String name;
    private String city;

    public User(String  id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}