package com.bee.beeapiclientsdk.exception;

import lombok.Data;

/**
 * @author ZhuWeiFeng
 * @Description 错误返回类
 */

@Data
public class ErrorResponse {
    private String message;
    private int code;
}