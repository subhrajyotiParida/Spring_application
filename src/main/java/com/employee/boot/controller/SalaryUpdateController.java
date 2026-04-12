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



}
