package com.prototype;

public class Dataentry
{

/*
* Prototype Design pattern
* Deep copying of objects
* */
    public static void main(String[] args) throws CloneNotSupportedException {
        Office office1 = new Office();
        office1.setOfficeName("Mechatron Technologies");
        office1.setLocation("Pune");
        office1.loadEmployeeData();
//        office1.getEmployeesList().remove(0);
        System.out.println("**********************************************************************");
        System.out.println("Office Name:"+office1.getOfficeName());
        System.out.println("Office Location:"+office1.getLocation());
        System.out.println("\n");
        System.out.println("Employees Data from "+office1.getLocation()+" Office.");

        for (int i=0;i<office1.getEmployeesList().size();i++)
        {
            System.out.println(office1.getEmployeesList().get(i));
        }
        System.out.println("\n");
        System.out.println("**********************************************************************");




        Office office2 = new Office();
        office2=office1.clone();
        office2.setOfficeName("Mechatron Technologies");
        office2.setLocation("Mumbai");
        System.out.println("\n");
        office2.loadEmployeeData();
        System.out.println("Office Name:"+office2.getOfficeName());
        System.out.println("Office Location:"+office2.getLocation());
        System.out.println("\n");
        System.out.println("Employees Data copied from "+office1.getLocation()+ " Office to "+office2.getLocation()+" office.");

        for (int i=0;i<office2.getEmployeesList().size();i++)
        {
            System.out.println(office2.getEmployeesList().get(i));
        }
//        System.out.println(office2);



    }
}
