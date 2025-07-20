package com.liubf.qingge2024.controller;

import com.liubf.qingge2024.common.Result;
import com.liubf.qingge2024.entity.Employee;
import com.liubf.qingge2024.service.EmployeeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeControtoller {

    @Resource
    private EmployeeService employeeService;

    @GetMapping("selectAll")
    public Result selectAll(){
        List<Employee> list = employeeService.selectAll();
        return Result.success(list);
    }


}
