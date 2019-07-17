package com.tw.apistackbase.core;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int EmbeddedId;
    private int age;
    private String name;

    public Employee() {
    }

    public Employee(String name, int age){
        this.name = name;
        this.age =age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
