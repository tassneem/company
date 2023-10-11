package com.example.company.controller;

import com.example.company.Entity.Employee;
import com.example.company.hander.EmployeeHandler;
import com.example.company.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;
    private EmployeeHandler employeeHandler;


    @GetMapping()
    public List<Employee> getAll(){
        return employeeHandler.getAll();
    }
    @GetMapping("/{id}")
    public Employee getById(@PathVariable(value = "id") Integer id)
    {
        return employeeHandler.getById(id);
    }

    @PostMapping()
    public void save(@RequestBody Employee employee){
        employeeHandler.save(employee);
    }

    @PutMapping("/{id}")
    public void update (@RequestBody Employee employee,
                        @PathVariable(value = "id") Integer id) {
       employeeHandler.update(employee,id);
    }
    @DeleteMapping( "/{id}")
    public void delete (@PathVariable(value = "id") Integer id)
    {
        employeeHandler.delete(id);
    }

}
