package com.employee.boot.controller;

public class SalaryUpdateController
{
    public  SalaryUpdateController(){
        System.out.println("Salary update calculation");
    }

    public double sarayUpdate(){
         double basicSal=50000;
        double totalSal=basicSal*2.8;;
        System.out.println(totalSal);
         return totalSal;

    }

    public void deleteSalary(){
        System.out.println("Deleted salary");
        System.out.println("Verify salary deleted");
        System.out.println("Verify for this emp");
    }



}
