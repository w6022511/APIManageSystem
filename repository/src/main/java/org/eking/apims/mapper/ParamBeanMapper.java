package org.eking.apims.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.eking.apims.model.ParamBean;

public interface ParamBeanMapper {
    /**
     *
     * @mbg.generated 2018-04-25
     */
    int deleteByPrimaryKey(String paramId);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int insert(ParamBean record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int insertSelective(ParamBean record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    ParamBean selectByPrimaryKey(String paramId);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int updateByPrimaryKeySelective(ParamBean record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int updateByPrimaryKey(ParamBean record);
}