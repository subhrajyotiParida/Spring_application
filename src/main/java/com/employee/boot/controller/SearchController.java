package com.employee.boot.controller;


import com.employee.boot.model.Employee;
import com.employee.boot.repository.EmlployeeRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/update")
@CrossOrigin(origins = "http://localhost:4200")
public class SearchController {

    private final EmlployeeRepository empRepository;


    public SearchController(EmlployeeRepository empRepository) {
        this.empRepository = empRepository;
    }


        @GetMapping("/searchEmployee")
        public void search(@RequestBody Employee emp){
            System.out.println("Service layer hit here "+emp.toString());

        }

    }

