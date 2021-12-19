package com.example.contacts;

public class Person {
    String name, number;
    int pic;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getPic() {
        return pic;
    }

    public Person(String name, String number, int pic) {
        this.name = name;
        this.number = number;
        this.pic = pic;
    }
}
