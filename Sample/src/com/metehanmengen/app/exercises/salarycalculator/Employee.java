package com.metehanmengen.app.exercises.salarycalculator;

public class Employee {
    //veri elemanlarını encapsulation gereği private yaptım. tek değer alacağı için de final.
    private final String name;
    private final double salary;
    private final int workHours;
    private final int hireYear; // İşe başlangıç yılı.
    private final int nowYear;

    public Employee(String name, int salary, int workHours, int hireYear, int nowYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.nowYear = nowYear;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public double tax()
    {
        double tax;
        if (salary < 1000)
            tax = 0;
        else
            tax = salary * 0.03;

        return tax;
    }

    public double bonus()
    {
        double bonus = 0;
        if (workHours > 40)
            bonus = (workHours - 40) * 30;

        return bonus;
    }

    public double raiseSalary(int year)
    {
        double raise = 0;
        double diffYear = year - hireYear;

        if (diffYear < 10)
            raise = salary * 0.05;
        else if (diffYear > 10 && diffYear < 20)
            raise = salary * 0.1;
        else
            raise = salary * 0.15;
        return raise;
    }
    @Override
    public String toString()
    {
        return String.format("%s isimli çalışanın maaşı : %2f dir. %n%d saat çalışır. %d tarihinde işe girmiştir. %n%02f bonusu bulunmaktadır. %02f vergi öder.%n%02f maaşı arttırılacak. "
                ,name ,salary, workHours, hireYear, bonus(), tax(), raiseSalary(nowYear));
    }



}
