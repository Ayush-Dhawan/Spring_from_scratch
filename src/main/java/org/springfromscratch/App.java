package org.springfromscratch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App 
{
    public static void main( String[] args ){
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       Alien obj = context.getBean(Alien.class);
//       obj.age = 15;
       obj.name = "ayush";


        System.out.println(obj.age);
    }
}
