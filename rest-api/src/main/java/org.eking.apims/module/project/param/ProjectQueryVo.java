package org.eking.apims.module.project.param;

/**
* 数据传输vo
* @Author wangyu
* @Date 2018/4/26
*/
public class ProjectQueryVo {

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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}
