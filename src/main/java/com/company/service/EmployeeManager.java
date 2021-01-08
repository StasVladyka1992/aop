package com.company.service;


import com.company.annotation.MyAnnotation;
import com.company.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class EmployeeManager implements MyInterface {
    static HashMap<Long, Employee> db = new HashMap<>();

    static {
        db.put(1L, new Employee(1L, "Alex", "Gussin"));
        db.put(2L, new Employee(2L, "Brian", "Schultz"));
    }

    @MyAnnotation
    public static Employee getEmployeeById(Long id) {
        return db.get(id);
    }
}