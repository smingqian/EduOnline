package com.eduonline.base.exception;

import java.io.Serializable;

/**
 * @author qsun
 * @version 1.0
 * @description 错误响应参数包装
 * @date 2/20/2023 10:28 PM
 */
public class RestErrorResponse implements Serializable {
    private String errMessage;

    public RestErrorResponse(String errMessage) {
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
