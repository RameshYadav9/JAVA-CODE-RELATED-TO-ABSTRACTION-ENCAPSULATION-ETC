package org.example;

public class Address {
    private String city;
    private int pincode;
    private String hNo;

    public Address(){
        this.city="Delhi";
        this.pincode=110001;
        this.hNo ="A-1";
    }


    //Parameterized Constructor

    public Address(String city,String hNo,int pincode){
        this.city=city;
        this.hNo=hNo;
        this.pincode=pincode;
    }
    @Override
    public String toString(){
        return "city = " + this.city + " hno = " + hNo + " pincode = " + pincode;
    }


    public void setCity(String udaipur) {
    }

    public void sethNo(String s) {
    }

    public void setPincode(int i) {
    }
}
