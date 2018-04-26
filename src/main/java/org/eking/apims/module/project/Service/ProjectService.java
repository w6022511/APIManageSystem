package org.eking.apims.module.project.Service;

import org.eking.apims.common.mapper.ProjectBeanMapper;
import org.eking.apims.common.model.ProjectBean;
import org.eking.apims.common.utils.IDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
*
* @Author wangyu
* @Date 2018/4/25 
*/  
@Service
public class ProjectService {

    @Autowired
    private ProjectBeanMapper projectBeanMapper;

    @Autowired
    private IDUtil idUtil;

    public boolean createProject(ProjectBean project){

        //传入uuid
        project.setProjectId(idUtil.genUUID());

        project.setcDate(new Date());
        if (projectBeanMapper.insertSelective(project) > 0){
            return true;
        }

        return false;
    }

    public ProjectBean getProjectById(String id){

        return projectBeanMapper.selectByPrimaryKey(id);
    }
}
