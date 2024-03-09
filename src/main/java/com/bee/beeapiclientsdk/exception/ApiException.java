package com.bee.beeapiclientsdk.exception;

import com.bee.beeapiclientsdk.common.ErrorCode;

/**
 * @author ZhuWeiFeng
 * @create 17:34
 * @Description 自定义异常类
 */
public class ApiException extends Exception{
    private static final long serialVersionUID = -7417385712557732527L;

    private int code;

    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public ApiException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
