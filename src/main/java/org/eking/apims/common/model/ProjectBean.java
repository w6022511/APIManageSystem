package org.eking.apims.common.model;

import java.util.Date;

/**
 * table: t_project_info
 */
public class ProjectBean {
    private String projectId;

    private String projectName;

    /**
     * 服务器ip
     */
    private String serverIp;

    /**
     * 端口
     */
    private String port;

    private String extn1;

    private String extn2;

    private String extn3;

    private String extn4;

    private Date cDate;

    private Date uDate;

    /**
     * 
     * @return PROJECT_ID 
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 
     * @param projectId 
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    /**
     * 
     * @return PROJECT_NAME 
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 
     * @param projectName 
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * 服务器ip
     * @return SERVER_IP 服务器ip
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     * 服务器ip
     * @param serverIp 服务器ip
     */
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp == null ? null : serverIp.trim();
    }

    /**
     * 端口
     * @return PORT 端口
     */
    public String getPort() {
        return port;
    }

    /**
     * 端口
     * @param port 端口
     */
    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
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
}