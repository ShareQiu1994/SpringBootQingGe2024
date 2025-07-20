package com.liubf.qingge2024.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    public Employee selectById(Integer id) {
        return employeeMapper.selectById(id);
    }

    public List<Employee> selectList(Employee employee) {
        System.out.println(employee);
      return null;
    }

    public PageInfo<Employee> selectPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Employee> list = employeeMapper.selectAll();
        return new PageInfo<>(list);
    }

    public void add(Employee employee) {
        employeeMapper.add(employee);
    }

    public void update(Employee employee) {
        employeeMapper.update(employee);
    }

    public void deleteById(Integer id) {
        employeeMapper.deleteById(id);
    }
}
