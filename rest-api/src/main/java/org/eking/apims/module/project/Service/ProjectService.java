package org.eking.apims.module.project.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.eking.apims.common.utils.PageInfo;
import org.eking.apims.mapper.ProjectBeanMapper;
import org.eking.apims.model.ProjectBean;
import org.eking.apims.utils.IDUtil;
import org.eking.apims.module.project.param.ProjectQueryVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

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

    /**
    *
    *分页查询
    *@param
    *@return
    *
    */
    public PageInfo<ProjectBean> getProjects(Map map){

        Integer pageNumber = map.get("pageNumber") == null ? 1 : Integer.parseInt(map.get("pageNumber").toString());
        Integer pageSize = map.get("pageSize") == null ? PageInfo.pageSize : Integer.parseInt(map.get("pageSize").toString());
        PageHelper.startPage(pageNumber , pageSize);

        List<ProjectBean> list = projectBeanMapper.selectBySelective(map);
        Page<ProjectBean> page = (Page<ProjectBean>) list;
        Integer total = (int) page.getTotal();
        Integer pages = page.getPages();

        PageInfo<ProjectBean> pageInfo =
                new PageInfo<>(page, pageSize, pageNumber, total, pages);
        return pageInfo;
    }


}
