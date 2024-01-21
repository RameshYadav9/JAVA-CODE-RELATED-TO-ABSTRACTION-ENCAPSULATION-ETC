package org.example;

public class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    // Override toString() to provide a meaningful string representation
    @Override
    public String toString() {
        return "MyClass{value=" + value + "}";
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(42);
        System.out.println(obj.toString()); // Calls the overridden toString() method
    }
}
