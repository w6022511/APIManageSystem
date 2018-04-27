package org.eking.apims.common.commonbean;

/**
* 
* @Author wangyu
* @Date 2018/4/25 
*/  
public class ResponseBean<T> {

    private String message;

    private Integer code;

    private T body;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public ResponseBean(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public ResponseBean() {
    }

    public ResponseBean(String message, Integer code, T body) {
        this.message = message;
        this.code = code;
        this.body = body;
    }


}
