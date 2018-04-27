package org.eking.apims.utils;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
* 
* @Author wangyu
* @Date 2018/4/25
*/  
@Component
public class IDUtil {

    public synchronized String genUUID() {
        String key = UUID.randomUUID().toString();
        key = key.replace("-", "");
        return key.toUpperCase();
    }
}
