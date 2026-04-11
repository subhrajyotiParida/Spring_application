package com.employee.boot.controller;

import com.employee.boot.model.Employee;

public class SearchController {
    private String searchTerm;
    public SearchController(){


    }

    private String search(String text){
        System.out.println("search the test in db and return the value");
        return text;
    }

    private String advancedSearch(Employee emp){
        return emp.getFirstname();
    }
}
