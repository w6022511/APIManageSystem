package org.eking.apims.module.project.Controller;

import org.eking.apims.common.commonbean.ResponseBeanGen;
import org.eking.apims.common.model.ProjectBean;
import org.eking.apims.common.commonbean.ResponseBean;
import org.eking.apims.module.project.Service.ProjectService;
import org.eking.apims.module.project.param.ProjectQueryVo;
import org.eking.apims.module.project.param.ProjectShowVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

        return ResponseBeanGen.error("添加失败");
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

        if (project == null){
            return ResponseBeanGen.error("此项目不存在");
        }
        ProjectShowVo show = new ProjectShowVo();
        BeanUtils.copyProperties(project, show);
        return ResponseBeanGen.success(show);
    }
}
