package com.eduonline.base.exception;

import java.util.SimpleTimeZone;

/**
 * @author qsun
 * @version 1.0
 * @description TODO
 * @date 2/20/2023 10:24 PM
 */
public class EduOnlineException extends RuntimeException {
    private static final long serialVersionUID = 5565760508056698922L;

    private String errMessage;

    public EduOnlineException() {
        super();
    }

    public EduOnlineException(String errMessage) {
        super(errMessage);
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public static void cast(CommonError commonError) {
        throw new EduOnlineException(commonError.getErrMessage());
    }

    public static void cast(String errMessage) {
        throw new EduOnlineException(errMessage);
    }
}
