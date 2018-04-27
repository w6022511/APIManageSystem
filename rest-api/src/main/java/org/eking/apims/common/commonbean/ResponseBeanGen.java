package org.eking.apims.common.commonbean;

import org.eking.apims.common.enums.Code;

/**
* 
* @Author wangyu
* @Date 2018/4/25 
*/  
public class ResponseBeanGen {

    public static ResponseBean success(){

        return new ResponseBean(Code.SUCCESS.getMessage(),Code.SUCCESS.getKey());
    }

    public static <T> ResponseBean<T> success(T body){
        return new ResponseBean<T>(Code.SUCCESS.getMessage(),Code.SUCCESS.getKey(), body);
    }

    public static ResponseBean error(String message){
        return new ResponseBean(message,Code.ERROR.getKey());
    }
}
