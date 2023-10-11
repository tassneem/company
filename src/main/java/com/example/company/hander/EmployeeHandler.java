package com.example.company.hander;

import com.example.company.Entity.Employee;
import com.example.company.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Component
public class EmployeeHandler {

    private EmployeeService employeeService;


    public List<Employee> getAll(){
        List<Employee> employeeList = employeeService.getAll();
        return employeeList;
    }
    public Employee getById(Integer id)
    {
        Optional<Employee> employee1= employeeService.getById(id);
        if(employee1.isPresent()){
            return employee1.get();
        }
        else {
            return new Employee();
        }
    }
    public void save(Employee employee){

        employeeService.save(employee);
    }

    public void update(Employee employee , Integer id)
    {
        Optional<Employee> employee1= employeeService.getById(id);
        if(employee1.isPresent()) {
            employeeService.save(employee);
        }
        else
            System.out.println("not found in update");
    }

    public void delete( Integer id)
    {
        Optional<Employee> employee1= employeeService.getById(id);
        if(employee1.isPresent()) {
            employeeService.delete(employee1.get());
        }
        else
            System.out.println("not found in delete");
    }

}
