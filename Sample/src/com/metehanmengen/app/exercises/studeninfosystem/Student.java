package com.metehanmengen.app.exercises.studeninfosystem;

public class Student {
    Course math;
    Course physics;
    Course chemistry;
    String name;
    String studentNo;
    int classes;
    double average;
    boolean isPass;

    public Student(String name, String studentNo, int classes, Course math, Course physics, Course chemistry)
    {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkVerbalNote(int mathVerbal, int physicsVerbal, int chemistryVerbal)
    {
        if (mathVerbal >= 0 && mathVerbal <= 100) {
            this.math.verbalNote = mathVerbal;
        }

        if (physicsVerbal >= 0 && physicsVerbal <= 100) {
            this.physics.verbalNote = physicsVerbal;
        }

        if (chemistryVerbal >= 0 && chemistryVerbal <= 100) {
            this.chemistry.verbalNote = chemistryVerbal;
        }
    }

    public void addBulkExamNote(int mathExam, int physicsExam, int chemistryExam)
    {
        if (mathExam >= 0 && mathExam <= 100) {
            this.math.note = mathExam;
        }

        if (physicsExam >= 0 && physicsExam <= 100) {
            this.physics.note = physicsExam;
        }

        if (chemistryExam >= 0 && chemistryExam <= 100) {
            this.chemistry.note = chemistryExam;
        }
    }

    public void calculateAverage()
    {
        this.average = ((this.math.note + this.math.verbalNote) / 2.0 +
                (this.physics.note + this.physics.verbalNote) / 2.0 +
                (this.chemistry.note + this.chemistry.verbalNote) / 2.0) / 3.0;
    }

    public void isPass()
    {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("Notes are not fully entered.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("\nAverage: " + this.average);
            if (this.isPass) {
                System.out.println("Passed the class");
            } else {
                System.out.println("Failed the class");
            }
        }
    }

    public boolean isCheckPass()
    {
        calculateAverage();
        return this.average > 55;
    }

    public void printNote()
    {
        System.out.println("----------------------------");
        System.out.println("Student: " + this.name);
        System.out.println("----------------------------");
        System.out.println(this.math.name +
                "\nExam Note: " + this.math.note + "\nVerbal Note: " + this.math.verbalNote);
        System.out.println("----------------------------");
        System.out.println(this.physics.name +
                "\nExam Note: " + this.physics.note + "\nVerbal Note: " + this.physics.verbalNote);
        System.out.println("----------------------------");
        System.out.println(this.chemistry.name +
                "\nExam Note: " + this.chemistry.note + "\nVerbal Note: " + this.chemistry.verbalNote);
    }
}
