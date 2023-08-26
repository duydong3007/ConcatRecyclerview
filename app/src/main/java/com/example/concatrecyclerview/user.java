package com.example.concatrecyclerview;

public class user {
    private int anhuser;
    private String name;
    private String address;

    public user(int anhuser, String name, String address) {
        this.anhuser = anhuser;
        this.name = name;
        this.address = address;
    }

    public int getAnhuser() {
        return anhuser;
    }

    public void setAnhuser(int anhuser) {
        this.anhuser = anhuser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
