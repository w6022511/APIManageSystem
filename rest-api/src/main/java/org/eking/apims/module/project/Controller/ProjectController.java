package org.eking.apims.module.project.Controller;

import org.eking.apims.common.commonbean.ResponseBean;
import org.eking.apims.common.commonbean.ResponseBeanGen;
import org.eking.apims.common.exceptions.BussinessRuntimeException;
import org.eking.apims.common.utils.PageInfo;
import org.eking.apims.model.ProjectBean;
import org.eking.apims.module.project.Service.ProjectService;
import org.eking.apims.module.project.param.ProjectQueryVo;
import org.eking.apims.module.project.param.ProjectShowVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
* 项目管理接口入口
* @Author wangyu
* @Date 2018/4/25
*/
@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /**
    *
    *创建项目Demo
    *@param
    *@return
    *
    */
    @PostMapping("/project")
    public ResponseBean createProject(@RequestBody ProjectQueryVo projectQueryVo){

        if (projectService.createProject(projectQueryVo)){
            return ResponseBeanGen.success();
        }

        return null;
    }

    /**
     *
     *通过id获取项目Demo
     *@param
     *@return
     *
     */
    @GetMapping("/project/{projectId}")
    public ResponseBean getProjectById(@PathVariable("projectId") String projectId){


        ProjectBean project = projectService.getProjectById(projectId);

        ProjectShowVo showVo = new ProjectShowVo();
        BeanUtils.copyProperties(project, showVo);
        return ResponseBeanGen.success(showVo);
    }

    /**
    *
    *列表查询
    *@param
    *@return
    *
    */
    @GetMapping("/projects")
    public ResponseBean getProjects(@RequestParam Map<String,Object> map){


        PageInfo<ProjectShowVo> pageInfo = projectService.getProjects(map);

        return ResponseBeanGen.success(pageInfo);
    }

    /**
    *
    *修改项目
    *@param
    *@return
    *
    */
    @PutMapping("/project")
    public ResponseBean updateProjectById(@RequestBody ProjectQueryVo vo){
        if(projectService.updateProject(vo)){
            return ResponseBeanGen.success();
        }
        return null;
    }

}
