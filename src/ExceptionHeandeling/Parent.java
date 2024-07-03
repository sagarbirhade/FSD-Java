package ExceptionHeandeling;


import ExceptionHeandeling.ThrowKeyword.CustomizedException.MyException;

public class Parent {
    void display() throws MyException {
        System.out.println("parent class method");
    }
    static void anotherMethod(){
        System.out.println("parent class anotherMethod()");
    }
}

