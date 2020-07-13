package com.codecool.helloworld.hello;

// Do not change this source code
public class HelloWorld {
    public void welcome(String name) {
        if(name == null) {
            System.out.println("Hello World!");
        } else {
            System.out.println("Hello " + name + "!");
        }
    }
}
