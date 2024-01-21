package org.constructor;

public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass("Mr", "Ramesh");
        System.out.print(myObject.myName+ " ");
        System.out.println(myObject.myTitle);

    }
}
