package com.example.company.model;

import com.example.company.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

  //@Query(value = " select e from Employee e ")
  //List<Employee> getAll();

   // @Query(value = " select e from Employee e where e.id = :id ")
    // Employee findByIdd(@Param(value = "id") Integer id);

    //Employee findEmployeeBySalary(Integer salary);
}
