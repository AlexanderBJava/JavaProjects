package ru.el.test.ru.el.test.myFirstPrj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.el.test.ru.el.test.myFirstPrj.model.Employee;
import ru.el.test.ru.el.test.myFirstPrj.service.EmployeeService;

@RestController
@RequestMapping(path ="/api", produces = "application/json; charset=UTF-8")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @GetMapping
    public Employee GetEmployee() {
        return employeeService.getEmployee();
    }

}
