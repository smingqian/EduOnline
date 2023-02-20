package com.eduonline.base.exception;

/**
 * @author qsun
 * @version 1.0
 * @description 通用错误信息
 * @date 2/20/2023 10:21 PM
 */
public enum CommonError {

    UNKOWN_ERROR("执行过程异常，请重试。"),
    PARAMS_ERROR("非法参数"),
    OBJECT_NULL("对象为空"),
    QUERY_NULL("查询结果为空"),
    REQUEST_NULL("请求参数为空");

    private  String errMessage;

    private CommonError(String errMessage){
        this.errMessage = errMessage;
    }

    public String getErrMessage(){
        return errMessage;
    }

}
