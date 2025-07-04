package org.example.demo;

public class Student {

    private int id;
    private String name;

    public String name() {
        return name;
    }

    public int id() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }
}
