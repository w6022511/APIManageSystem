package org.eking.apims.module.project.param;

import java.util.Date;

/**
* 数据展示vo
* @Author wangyu
* @Date 2018/4/26
*/
public class ProjectShowVo {

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

    private Date cDate;

    private Date uDate;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    public Date getuDate() {
        return uDate;
    }

    public void setuDate(Date uDate) {
        this.uDate = uDate;
    }
}
