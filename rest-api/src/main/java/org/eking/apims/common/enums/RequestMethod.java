package org.eking.apims.common.enums;

/**
*
* @Author wangyu
* @Date 2018/4/25
*/
public enum RequestMethod {

    GET(1 , "GET"),
    POST(2 , "POST"),
    PUT(3 , "PUT"),
    DELETE(4 , "DELETE");

    private Integer key;
    private String type;

    public Integer getKey() {
        return key;
    }

    public String getType() {
        return type;
    }

    RequestMethod(Integer key, String type) {
        this.key = key;
        this.type = type;
    }
}
