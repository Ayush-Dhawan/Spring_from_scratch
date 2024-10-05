package org.springfromscratch;

public class Laptop implements Computer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Laptop(){
        System.out.println("laptop assigned to alien...");
        compile();
    }

    public void compile(){

        System.out.println("in laptop compile");
    }
}
