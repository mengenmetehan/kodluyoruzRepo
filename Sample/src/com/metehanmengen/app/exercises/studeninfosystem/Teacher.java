package com.metehanmengen.app.exercises.studeninfosystem;

public class Teacher {
    String name;
    String phoneNo;
    String branch;
    String email;

    public Teacher(String name, String phoneNo,String branch,String email){
        this.name = name;
        this.phoneNo = phoneNo;
        this.branch = branch;
        this.email = email;
    }

    public void print(){
        System.out.println("Name: " + this.name);
        System.out.println("Branch: " + this.branch);
        System.out.println("Phone Number: " + this.phoneNo);
        System.out.println("E-Mail: " + this.email);
    }
}
