package org.example;

public class Person {
    private int age;
    public String name;
    private Address address;

    private String userPassword ="ewqeqrweqrew";

    //Default Constructor
    public Person(){
    }

    //Parameterized Constructor
    public Person(String name,int age,Address address){
        this(name,age);
        this.address= address;
    }

    public Person(String name,int age){
        this.age= age;
        this.name = name;
    }


    public void method1(){

    }
    public  void method2(){
        this.method1();
    }


    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setName(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUserPassword(){
        return userPassword;
    }
}