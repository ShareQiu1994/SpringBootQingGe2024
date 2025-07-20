package com.liubf.qingge2024.mapper;

import com.liubf.qingge2024.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    // 通过xml配置放方式 写SQL
    List<Employee> selectAll();

    // 通过注解的形式
    @Select("select * from `employee` where id = #{id}")
    Employee selectById(Integer id);


    void add(Employee employee);

    void update(Employee employee);


    @Delete("delete from `employee` where id = #{id}")
    void deleteById(Integer id);
}
