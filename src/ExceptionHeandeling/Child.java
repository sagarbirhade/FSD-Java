package ExceptionHeandeling;

import java.io.IOException;

public class Child extends Parent{
    @Override
    void display() throws MyCustomException{
        System.out.println("Child class method");
    }

    public static void main(String[] args){
        Parent p = new Child();

        try{
            p.display();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
