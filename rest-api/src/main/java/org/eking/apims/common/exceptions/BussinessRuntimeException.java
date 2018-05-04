package org.eking.apims.common.exceptions;

/**
* 自定义异常
* @Author wangyu
* @Date 2018/5/4
*/
public class BussinessRuntimeException extends RuntimeException {

    //错误码
    private Integer errorCode;

    //错误描述
    private String message;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BussinessRuntimeException(String message) {

        this.message = message;
    }
}
