package com.example.company.service;

import com.example.company.Entity.Department;
import com.example.company.Entity.Employee;
import com.example.company.model.DepartmentRepository;
import com.example.company.model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAll(){

        List<Department> departmentList = departmentRepository.findAll();
        return departmentList;
    }
    public Optional<Department> getById(Integer id)
    {
        return departmentRepository.findById(id);
    }
    public Department getReferenceById(Integer id)
    {
        return departmentRepository.getReferenceById(id);
    }
    public void save(Department department){

        departmentRepository.save(department);
    }
    public void update(Department d,Integer id)
    {

        departmentRepository.save(d);
    }

    public void delete (Department department)
    {

        departmentRepository.delete(department);
    }
}
