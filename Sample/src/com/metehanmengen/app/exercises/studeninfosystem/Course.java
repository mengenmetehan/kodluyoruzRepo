package com.metehanmengen.app.exercises.studeninfosystem;

public class Course {
    Teacher courseTeacher;
    String name;
    String prefix;
    int verbalNote;
    int note;

    //ctor ile isim ve ön ek ataması yapıldı.
    public Course(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;
    }
    //öğretmen sınıfının nesnesi kullanılarak öğretmen eklenildi.
    public void addTeacher(Teacher courseTeacher) {
        if (courseTeacher.branch.equals(this.prefix)) {
            this.courseTeacher = courseTeacher;
            System.out.println("Transaction successful.");
        } else {
            System.out.println("Academician cannot teach this course");
        }
    }

    public void printTeacher() {
        if (this.courseTeacher != null) {
            System.out.println("Academician of the " + this.name + ": " + this.courseTeacher.name);
        } else {
            System.out.println(this.name + " does not have an academician yet.");
        }
    }
}
