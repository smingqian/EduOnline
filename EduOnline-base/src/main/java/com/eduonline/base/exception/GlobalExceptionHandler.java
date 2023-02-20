package com.eduonline.base.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author qsun
 * @version 1.0
 * @description 全局异常处理
 * @date 2/20/2023 10:54 PM
 */
@Slf4j
@ControllerAdvice//控制器增强器
public class GlobalExceptionHandler {

    /**
    * @description 可预知的异常
    * @param null
    * @return
    * @author qsun
    * @date 2/20/2023 11:00 PM
    */
    @ResponseBody
    @ExceptionHandler(EduOnlineException.class)//捕获该异常
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)//改变状态码，返回500
    public RestErrorResponse customException (EduOnlineException e){
        String errMessage = e.getErrMessage();
        log.error("【系统异常】{}",e.getErrMessage(),e);
        return new RestErrorResponse(errMessage);
    }

    /**
    * @description 不可预知的异常
    * @param null
    * @return
    * @author qsun
    * @date 2/20/2023 11:00 PM
    */
    @ResponseBody
    @ExceptionHandler(Exception.class)//捕获该异常
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)//改变状态码，返回500
    public RestErrorResponse doException (Exception e) {
        String errMessage = e.getMessage();
        log.error("【系统异常】{}",e.getMessage(),e);
        return new RestErrorResponse(CommonError.UNKOWN_ERROR.getErrMessage());
    }
}
