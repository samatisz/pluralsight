package com.pluralsight;

public class Guest {
    private String name;
    private int age;
    private boolean isCheckedIn;

    public Guest(String name, int age) { //ths checkedIn is not here cause the guest can't do this
        this.name = name;
        this.age = age;
        this.isCheckedIn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    // isCheckedIn does not get a setter cause guest is not allowed access to that

    public void checkIn(){
        this.isCheckedIn = true;
    }

    public void checkOut(){
        this.isCheckedIn = false;
    }

}
