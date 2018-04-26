package org.eking.apims.common.model;

import java.util.Date;

/**
 * table: t_api_info
 */
public class ApiBean {
    private String apiId;

    private String apiUri;

    /**
     * 1.GET,2.POST,3.PUT,4.DELETE
     */
    private Integer requestMethed;

    /**
     * 接口介绍
     */
    private String introduction;

    /**
     * 创建时间
     */
    private Date cDate;

    /**
     * 最后更新时间
     */
    private Date uDate;

    /**
     * 保留字段1
     */
    private String extn1;

    /**
     * 保留字段2
     */
    private String extn2;

    /**
     * 保留字段3
     */
    private String extn3;

    /**
     * 保留字段4
     */
    private String extn4;

    /**
     * 保留字段5
     */
    private String extn5;

    /**
     * 父级项目id
     */
    private String parentProjectId;

    /**
     * 
     * @return API_ID 
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * 
     * @param apiId 
     */
    public void setApiId(String apiId) {
        this.apiId = apiId == null ? null : apiId.trim();
    }

    /**
     * 
     * @return API_URI 
     */
    public String getApiUri() {
        return apiUri;
    }

    /**
     * 
     * @param apiUri 
     */
    public void setApiUri(String apiUri) {
        this.apiUri = apiUri == null ? null : apiUri.trim();
    }

    /**
     * 1.GET,2.POST,3.PUT,4.DELETE
     * @return REQUEST_METHED 1.GET,2.POST,3.PUT,4.DELETE
     */
    public Integer getRequestMethed() {
        return requestMethed;
    }

    /**
     * 1.GET,2.POST,3.PUT,4.DELETE
     * @param requestMethed 1.GET,2.POST,3.PUT,4.DELETE
     */
    public void setRequestMethed(Integer requestMethed) {
        this.requestMethed = requestMethed;
    }

    /**
     * 接口介绍
     * @return INTRODUCTION 接口介绍
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 接口介绍
     * @param introduction 接口介绍
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * 创建时间
     * @return C_DATE 创建时间
     */
    public Date getcDate() {
        return cDate;
    }

    /**
     * 创建时间
     * @param cDate 创建时间
     */
    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    /**
     * 最后更新时间
     * @return U_DATE 最后更新时间
     */
    public Date getuDate() {
        return uDate;
    }

    /**
     * 最后更新时间
     * @param uDate 最后更新时间
     */
    public void setuDate(Date uDate) {
        this.uDate = uDate;
    }

    /**
     * 保留字段1
     * @return EXTN1 保留字段1
     */
    public String getExtn1() {
        return extn1;
    }

    /**
     * 保留字段1
     * @param extn1 保留字段1
     */
    public void setExtn1(String extn1) {
        this.extn1 = extn1 == null ? null : extn1.trim();
    }

    /**
     * 保留字段2
     * @return EXTN2 保留字段2
     */
    public String getExtn2() {
        return extn2;
    }

    /**
     * 保留字段2
     * @param extn2 保留字段2
     */
    public void setExtn2(String extn2) {
        this.extn2 = extn2 == null ? null : extn2.trim();
    }

    /**
     * 保留字段3
     * @return EXTN3 保留字段3
     */
    public String getExtn3() {
        return extn3;
    }

    /**
     * 保留字段3
     * @param extn3 保留字段3
     */
    public void setExtn3(String extn3) {
        this.extn3 = extn3 == null ? null : extn3.trim();
    }

    /**
     * 保留字段4
     * @return EXTN4 保留字段4
     */
    public String getExtn4() {
        return extn4;
    }

    /**
     * 保留字段4
     * @param extn4 保留字段4
     */
    public void setExtn4(String extn4) {
        this.extn4 = extn4 == null ? null : extn4.trim();
    }

    /**
     * 保留字段5
     * @return EXTN5 保留字段5
     */
    public String getExtn5() {
        return extn5;
    }

    /**
     * 保留字段5
     * @param extn5 保留字段5
     */
    public void setExtn5(String extn5) {
        this.extn5 = extn5 == null ? null : extn5.trim();
    }

    /**
     * 父级项目id
     * @return PARENT_PROJECT_ID 父级项目id
     */
    public String getParentProjectId() {
        return parentProjectId;
    }

    /**
     * 父级项目id
     * @param parentProjectId 父级项目id
     */
    public void setParentProjectId(String parentProjectId) {
        this.parentProjectId = parentProjectId == null ? null : parentProjectId.trim();
    }
}