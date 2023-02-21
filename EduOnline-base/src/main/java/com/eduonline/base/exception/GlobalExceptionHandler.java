package com.eduonline.base.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

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
     * @param null
     * @return
     * @description 可预知的异常
     * @author qsun
     * @date 2/20/2023 11:00 PM
     */
    @ResponseBody
    @ExceptionHandler(EduOnlineException.class)//捕获该异常
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)//改变状态码，返回500
    public RestErrorResponse customException(EduOnlineException e) {
        String errMessage = e.getErrMessage();
        log.error("【系统异常】{}", e.getErrMessage(), e);
        return new RestErrorResponse(errMessage);
    }


    /**
     * @param null
     * @return
     * @description 对于JSR303的异常进行处理，可以替代手动合法性校验
     * @author qsun
     * @date 2/21/2023 2:14 PM
     */
    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)//捕获该异常
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)//改变状态码，返回500
    public RestErrorResponse doMethodArgumentNotValidException(MethodArgumentNotValidException e) {

        BindingResult bindingResult = e.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        StringBuffer errMsg = new StringBuffer();
        fieldErrors.stream().forEach(fieldError -> errMsg.append(fieldError.getDefaultMessage()).append(","));
        log.error("【系统异常】{}", e.getMessage(), e);
        return new RestErrorResponse(errMsg.toString());
    }

    /**
     * @param null
     * @return
     * @description 不可预知的异常
     * @author qsun
     * @date 2/20/2023 11:00 PM
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)//捕获该异常
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)//改变状态码，返回500
    public RestErrorResponse doException(Exception e) {
        String errMessage = e.getMessage();
        log.error("【系统异常】{}", e.getMessage(), e);
        return new RestErrorResponse(CommonError.UNKOWN_ERROR.getErrMessage());
    }
}
