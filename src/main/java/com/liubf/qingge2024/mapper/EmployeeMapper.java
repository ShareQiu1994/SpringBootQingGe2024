package com.liubf.qingge2024.mapper;

import com.liubf.qingge2024.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> selectALL();
}
