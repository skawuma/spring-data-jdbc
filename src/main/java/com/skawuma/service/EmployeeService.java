package com.skawuma.service;

import com.skawuma.entity.Employee;
import com.skawuma.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public String saveEmployee(Employee employee) {
        int count = repository.save(employee);
        return "RECORD INSERTED ! " + count;
    }

    public List<Employee> getEmployees(){
        return repository.findAll();
    }

    public List<Employee> getEmployeesUsingBeanPropertyRowMapper(){
        return repository.getALlEmployees();
    }

    public Employee getEmployeeById(int id){
        return repository.findById(id);
    }


    public String getNameById(int id){
        return repository.getNameById(id);
    }

    public List<Employee> findEmployeesByNameAndDept(String name,String dept){
        return repository.findByNameAndDept(name, dept);
    }


    public String updateEmployee(Employee employee){
        int count= repository.update(employee);
        return count+" RECORD UPDATED !";
    }

    public String deleteEmployee(int id){
        int count= repository.delete(id);
        return count+" RECORD DELETED !";
    }
}
