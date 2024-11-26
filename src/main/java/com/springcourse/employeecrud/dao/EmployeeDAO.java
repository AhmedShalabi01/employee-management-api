package com.springcourse.employeecrud.dao;

import com.springcourse.employeecrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
