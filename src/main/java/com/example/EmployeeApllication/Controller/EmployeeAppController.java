package com.example.EmployeeApllication.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Employee")
public class EmployeeAppController {

    @GetMapping
    public String EmployeeApp()
    {
       return "employee details";

    }

}
