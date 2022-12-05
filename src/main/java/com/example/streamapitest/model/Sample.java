package com.example.streamapitest.model;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class Sample {
    private final List<User> userList = Arrays.asList(
            new User(1, "Michael", "Robert", 37, "TR"),
            new User(2, "Mary", "Patricia", 11, "EN"),
            new User(3, "John", "Michael", 7, "FR"),
            new User(4, "Jennifer", "Linda", 77, "TR"),
            new User(5, "William", "Elizabeth", 23, "US"),
            new User(6, "Sue", "Jackson", 11, "IT"),
            new User(7, "Michael", "Tommy", 37, "EN")
    );

    public void forEachTest(){
        System.out.println("foreach test");
        userList.stream()
                .forEach(System.out::println);
    }

    public void foreachWithLogicTest(){
        System.out.println("foreach with logic test");
        userList.stream()
                .map(u -> {
                    return new User(
                            u.getId(),
                            "X " + u.getFirstName(),
                            "Y " + u.getLastName(),
                            u.getAge() + 10,u.getNationality());
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
