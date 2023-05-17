package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class Office implements Cloneable
{
    private String officeName;
    private String Location;

    private List<Employees> employeesList = new ArrayList<>();

    public Office() {
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }

    @Override
    public String toString() {
        return "Office{" +
                "officeName='" + officeName + '\'' +
                ", Location='" + Location + '\'' +
                ", employeesList=" + employeesList +
                '}';
    }

    public List<Employees> loadEmployeeData()
    {
        for (int i=1;i<=10;i++)
        {
            Employees emp=new Employees();
            emp.setEid(i);
            emp.setName("Name"+i);
            emp.setSalary(1000*i);

            getEmployeesList().add(emp);

        }

        return employeesList;
    }

    @Override
    public Office clone() throws CloneNotSupportedException {
        return new Office();
    }
}
