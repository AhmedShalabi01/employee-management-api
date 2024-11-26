package com.springcourse.employeecrud.service;

import com.springcourse.employeecrud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
