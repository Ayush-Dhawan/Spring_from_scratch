package org.springfromscratch;

import org.springframework.stereotype.Component;

@Component
public class Alien {
     String name;
     int age;
     Computer com;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Alien() {
        System.out.println("Alien created");
    }

    public void print(){
        System.out.println("inside alien print...");
    }

    public void setAge(int age) {
        this.age = age;
    }
}
