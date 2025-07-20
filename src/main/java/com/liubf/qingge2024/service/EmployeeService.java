package com.liubf.qingge2024.service;

import com.liubf.qingge2024.entity.Employee;
import com.liubf.qingge2024.mapper.EmployeeMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    public List<Employee> selectAll() {
       return employeeMapper.selectAll();
    }


}
