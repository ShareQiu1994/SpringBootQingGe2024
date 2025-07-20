package com.liubf.qingge2024.exception;


import com.liubf.qingge2024.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 全局异常处理类
 */
@ControllerAdvice("com.liubf.qingge2024.controller")
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result<Object> exception(Exception e){
      e.printStackTrace();
      return Result.error();
    }


  @ExceptionHandler(CustomException.class)
  @ResponseBody
  public Result<Object> exception(CustomException e){
    e.printStackTrace();
    return Result.error(e.getCode(),e.getMessage());
  }
}
