package com.liubf.qingge2024.controller;

import com.liubf.qingge2024.common.Result;
import com.liubf.qingge2024.exception.CustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class WebController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("map")
    public Result<Object> map(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","刘博方");
        map.put("age",18);
        return  Result.success(map);
    }

    @GetMapping("/success")
    public Result<Object> success(){
        // throw new CustomException(400,"错误! 禁止请求");  // 主动抛异常
        return Result.success(10);
    }

}
