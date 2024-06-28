package Abstraction;

import java.sql.SQLOutput;

abstract class Test {
    int a = 10;
    static int b = 20;
    public Test(){
        System.out.println("Abstract class constructor");
    }
    void display(){
        System.out.println("display() method of abstract class");
    }
    static void show(){
        System.out.println("static show() method of abstract class");
    }
    abstract void  printDetails();

}
