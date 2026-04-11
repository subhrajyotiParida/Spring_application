package com.employee.boot.controller;

public class SearchController {
    private String searchTerm;
    public SearchController(){


    }

    private String search(String text){
        System.out.println("search the test in db");
        return text;
    }
}
