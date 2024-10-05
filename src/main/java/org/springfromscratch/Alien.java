package org.springfromscratch;

import org.springframework.stereotype.Component;

@Component
public class Alien {
     String name;
     int age;
     Laptop lap;

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
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
