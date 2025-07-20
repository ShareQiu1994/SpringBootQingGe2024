package com.liubf.qingge2024.controller;

import com.github.pagehelper.PageInfo;
import com.liubf.qingge2024.common.Result;
import com.liubf.qingge2024.entity.Employee;
import com.liubf.qingge2024.service.EmployeeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeControtoller {

    @Resource
    private EmployeeService employeeService;

    /* 查所有 */
    @GetMapping()
    public Result selectAll(){
        List<Employee> list = employeeService.selectAll();
        return Result.success(list);
    }


    /* 新增数据 */
    @PostMapping()
    public  Result add(@RequestBody Employee employee){
        employeeService.add(employee);
        return Result.success();
    }


    /* 修改数据 */
    @PutMapping()
    public  Result update(@RequestBody Employee employee){
        employeeService.update(employee);
        return Result.success();
    }

    /* 删除数据 */
    @DeleteMapping({"{id}"})
    public  Result deleteById(@PathVariable("id") Integer id){
        employeeService.deleteById(id);
        return Result.success();
    }


    /* 查单个 动态路径传参 */
    @GetMapping("selectById/{id}")
    public Result selectById(@PathVariable("id") Integer id){
        Employee employee = employeeService.selectById(id);
        return Result.success(employee);
    }

    /*
    *   分页查询的数据
    *   pageNum: 当前页码
    *   pageSize: 每页多少条
    * */
    @GetMapping("Page")
    public Result selectPage(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "10") Integer pageSize){
        PageInfo<Employee> employee = employeeService.selectPage(pageNum,pageSize);
        return Result.success(employee);
    }

    /* 查单个 query传参 */
    @GetMapping("selectByParamId")
    public Result selectByParamId(@RequestParam Integer id, @RequestParam(required = false) Integer no){
        Employee employee = employeeService.selectById(id);
        return Result.success(employee);
    }

    /* 通过对象传参 能够接受employee对象所以参数 并且该对象下的所有参数 都不是必传的  */
    @GetMapping("selectList")
    public Result selectById(Employee employee){
        List<Employee> list = employeeService.selectList(employee);
        return Result.success(list);
    }





}
