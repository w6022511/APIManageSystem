package org.eking.apims.common.handles;

import org.eking.apims.common.commonbean.ResponseBean;
import org.eking.apims.common.commonbean.ResponseBeanGen;
import org.eking.apims.common.exceptions.BussinessRuntimeException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
* 异常处理类
* @Author wangyu
* @Date 2018/5/4
*/
@RestControllerAdvice
public class ControllerExceptionHandler {

    /**
    *
    *系统异常捕获
    *@param
    *@return
    *
    */
    @ExceptionHandler(Exception.class)
    public ResponseBean handleBadRequestParamException(Exception e){

        return ResponseBeanGen.error(e.toString());
    }

    /**
    *
    *自定义异常捕获
    *@param e
    *@return
    *
    */
    @ExceptionHandler(BussinessRuntimeException.class)
    public ResponseBean myException(BussinessRuntimeException e){

        return ResponseBeanGen.error(e.getMessage());
    }
}
