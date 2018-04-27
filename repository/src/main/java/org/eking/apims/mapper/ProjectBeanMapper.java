package org.eking.apims.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.eking.apims.model.ProjectBean;

import java.util.List;
import java.util.Map;

public interface ProjectBeanMapper {
    /**
     *
     * @mbg.generated 2018-04-25
     */
    int deleteByPrimaryKey(String projectId);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int insert(ProjectBean record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int insertSelective(ProjectBean record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    ProjectBean selectByPrimaryKey(String projectId);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int updateByPrimaryKeySelective(ProjectBean record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int updateByPrimaryKey(ProjectBean record);

    List<ProjectBean> selectBySelective(Map map);
}