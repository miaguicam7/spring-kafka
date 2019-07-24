package com.codenotfound.kafka.integration.entity;

public class Person {
    private String name;
    private String id;

    public Person(String id, String name ) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
