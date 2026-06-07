package com.employee.boot.controller;


import com.employee.boot.model.Employee;
import com.employee.boot.repository.EmlployeeRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/update")
@CrossOrigin(origins = "http://localhost:4200")
public class UpdteEmplyeeCOntroller {


    private final EmlployeeRepository empRepository;

     public UpdteEmplyeeCOntroller(EmlployeeRepository empRepository){
     this.empRepository=empRepository;
     }

    @PutMapping("/updateEmployee")
    public Employee createEmployee(@RequestBody Employee emp){
        System.out.println("Service layer hit here "+emp.toString());
        return empRepository.save(emp);
    }

}
