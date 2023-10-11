package com.example.company.hander;

import com.example.company.Entity.Department;
import com.example.company.Entity.Employee;
import com.example.company.service.DepartmentService;
import com.example.company.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Component
public class DepartmentHandler {
    private DepartmentService departmentService;


    public List<Department> getAll(){
        List<Department> departmentList = departmentService.getAll();
        return departmentList;
    }
    public Department getById(Integer id)
    {
        Optional<Department> department1= departmentService.getById(id);
        if(department1.isPresent()){
            return department1.get();
        }
        else {
            return new Department();
        }
    }
    public void save(Department department){

        departmentService.save(department);
    }

    public void update(Department department , Integer id)
    {
        Optional<Department> department1= departmentService.getById(id);
        if(department1.isPresent()) {
            departmentService.save(department);
        }
        else
            System.out.println("not found in update");
    }

    public void delete( Integer id)
    {
        Optional<Department> department1= departmentService.getById(id);
        if(department1.isPresent()) {
            departmentService.delete(department1.get());
        }
        else
            System.out.println("not found in delete");
    }

}
