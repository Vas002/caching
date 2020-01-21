package com.example.model;

import java.util.Arrays;
import java.util.List;

public class Student {

  int id;
    String name;
    String clz;

    public Student(int id, String name, String clz) {
        super();
        this.id = id;
        this.name = name;
        this.clz = clz;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClz() {
        return clz;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClz(String clz) {
        this.clz = clz;
    }

    public Student() {
    }

}