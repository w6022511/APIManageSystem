package org.eking.apims.common.enums;

/**
* 
* @Author wangyu
* @Date 2018/4/25 
*/  
public enum Code {

    SUCCESS(200 , "操作成功"),
    ERROR(400 , "操作失败");

    private Integer key;
    private String message;

    Code(Integer key, String message) {
        this.key = key;
        this.message = message;
    }

    public Integer getKey() {
        return key;
    }

    public String getMessage() {
        return message;
    }
}
