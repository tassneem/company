package com.example.company.controller;

import com.example.company.Entity.Department;
import com.example.company.Entity.Employee;
import com.example.company.hander.DepartmentHandler;
import com.example.company.hander.EmployeeHandler;
import com.example.company.service.DepartmentService;
import com.example.company.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@AllArgsConstructor
public class DepartmentController {
    private DepartmentService departmentService;
    private DepartmentHandler departmentHandler;


    @GetMapping()
    public List<Department> getAll(){
        return departmentHandler.getAll();
    }
    @GetMapping("/{id}")
    public Department getById(@PathVariable(value = "id") Integer id)
    {
        return departmentHandler.getById(id);
    }

    @PostMapping()
    public void save(@RequestBody Department department){
        departmentHandler.save(department);
    }

    @PutMapping("/{id}")
    public void update (@RequestBody Department department,
                        @PathVariable(value = "id") Integer id) {
        departmentHandler.update(department,id);
    }
    @DeleteMapping( "/{id}")
    public void delete (@PathVariable(value = "id") Integer id)
    {
        departmentHandler.delete(id);
    }

}
