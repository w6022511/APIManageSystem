package org.eking.apims.module.project.Service;

import org.eking.apims.common.mapper.ProjectBeanMapper;
import org.eking.apims.common.model.ProjectBean;
import org.eking.apims.common.utils.IDUtil;
import org.eking.apims.module.project.param.ProjectQueryVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public boolean createProject(ProjectQueryVo vo){

        ProjectBean project = new ProjectBean();
        BeanUtils.copyProperties(vo,project);
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

    @Transactional
    public boolean updateProject(ProjectQueryVo vo){

        ProjectBean project = new ProjectBean();
        BeanUtils.copyProperties(vo,project);

        project.setuDate(new Date());
        if (projectBeanMapper.updateByPrimaryKeySelective(project) > 0){
            return true;
        }
        return false;
    }
}
