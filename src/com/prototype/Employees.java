package com.prototype;

public class Employees
{
    private int eid;
    private String name;
    private double salary;



    public Employees() {
    }


    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
