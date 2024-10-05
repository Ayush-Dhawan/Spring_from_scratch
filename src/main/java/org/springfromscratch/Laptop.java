package org.springfromscratch;

public class Laptop {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Laptop(){
        System.out.println("laptop assigned to alien...");
    }
}
