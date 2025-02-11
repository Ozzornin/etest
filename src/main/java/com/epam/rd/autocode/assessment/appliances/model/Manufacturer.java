package com.epam.rd.autocode.assessment.appliances.model;

public class Manufacturer {
    private long id;
    private String name;

    public Manufacturer(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Manufacturer() {
        this.id = 0;
        this.name = "";
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
