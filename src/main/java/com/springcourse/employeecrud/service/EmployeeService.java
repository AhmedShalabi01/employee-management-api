package com.springcourse.employeecrud.service;

import com.springcourse.employeecrud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
