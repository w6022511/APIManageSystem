package org.eking.apims.common.model;

import java.util.Date;

/**
 * table: t_param_info
 */
public class ParamBean {
    private String paramId;

    /**
     * 参数名称
     */
    private String paramName;

    /**
     * 1.请求参数，2.响应参数
     */
    private Integer paramType;

    /**
     * 参数描述
     */
    private String paramIntro;

    /**
     * 参数示例值
     */
    private String paramValue;

    private Date cDate;

    private Date uDate;

    private String extn1;

    private String extn2;

    private String extn3;

    private String extn4;

    /**
     * 父级接口id
     */
    private String parentApiId;

    /**
     * 
     * @return PARAM_ID 
     */
    public String getParamId() {
        return paramId;
    }

    /**
     * 
     * @param paramId 
     */
    public void setParamId(String paramId) {
        this.paramId = paramId == null ? null : paramId.trim();
    }

    /**
     * 参数名称
     * @return PARAM_NAME 参数名称
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * 参数名称
     * @param paramName 参数名称
     */
    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    /**
     * 1.请求参数，2.响应参数
     * @return PARAM_TYPE 1.请求参数，2.响应参数
     */
    public Integer getParamType() {
        return paramType;
    }

    /**
     * 1.请求参数，2.响应参数
     * @param paramType 1.请求参数，2.响应参数
     */
    public void setParamType(Integer paramType) {
        this.paramType = paramType;
    }

    /**
     * 参数描述
     * @return PARAM_INTRO 参数描述
     */
    public String getParamIntro() {
        return paramIntro;
    }

    /**
     * 参数描述
     * @param paramIntro 参数描述
     */
    public void setParamIntro(String paramIntro) {
        this.paramIntro = paramIntro == null ? null : paramIntro.trim();
    }

    /**
     * 参数示例值
     * @return PARAM_VALUE 参数示例值
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * 参数示例值
     * @param paramValue 参数示例值
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    /**
     * 
     * @return C_DATE 
     */
    public Date getcDate() {
        return cDate;
    }

    /**
     * 
     * @param cDate 
     */
    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    /**
     * 
     * @return U_DATE 
     */
    public Date getuDate() {
        return uDate;
    }

    /**
     * 
     * @param uDate 
     */
    public void setuDate(Date uDate) {
        this.uDate = uDate;
    }

    /**
     * 
     * @return EXTN1 
     */
    public String getExtn1() {
        return extn1;
    }

    /**
     * 
     * @param extn1 
     */
    public void setExtn1(String extn1) {
        this.extn1 = extn1 == null ? null : extn1.trim();
    }

    /**
     * 
     * @return EXTN2 
     */
    public String getExtn2() {
        return extn2;
    }

    /**
     * 
     * @param extn2 
     */
    public void setExtn2(String extn2) {
        this.extn2 = extn2 == null ? null : extn2.trim();
    }

    /**
     * 
     * @return EXTN3 
     */
    public String getExtn3() {
        return extn3;
    }

    /**
     * 
     * @param extn3 
     */
    public void setExtn3(String extn3) {
        this.extn3 = extn3 == null ? null : extn3.trim();
    }

    /**
     * 
     * @return EXTN4 
     */
    public String getExtn4() {
        return extn4;
    }

    /**
     * 
     * @param extn4 
     */
    public void setExtn4(String extn4) {
        this.extn4 = extn4 == null ? null : extn4.trim();
    }

    /**
     * 父级接口id
     * @return PARENT_API_ID 父级接口id
     */
    public String getParentApiId() {
        return parentApiId;
    }

    /**
     * 父级接口id
     * @param parentApiId 父级接口id
     */
    public void setParentApiId(String parentApiId) {
        this.parentApiId = parentApiId == null ? null : parentApiId.trim();
    }
}