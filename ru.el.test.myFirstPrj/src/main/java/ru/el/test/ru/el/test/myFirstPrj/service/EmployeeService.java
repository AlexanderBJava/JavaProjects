package ru.el.test.ru.el.test.myFirstPrj.service;

import org.springframework.stereotype.Service;
import ru.el.test.ru.el.test.myFirstPrj.model.Employee;

import java.util.Date;


@Service
public class EmployeeService {

    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setName("Dowakin");
        employee.setBirthday(new Date());
        employee.setProf("Drakonorojdenniy");
        return employee;
    }
}
