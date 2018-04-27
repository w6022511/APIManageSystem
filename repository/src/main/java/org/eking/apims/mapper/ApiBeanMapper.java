package org.eking.apims.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.eking.apims.model.ApiBean;

@Mapper
public interface ApiBeanMapper {
    /**
     *
     * @mbg.generated 2018-04-25
     */
    int deleteByPrimaryKey(String apiId);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int insert(ApiBean record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int insertSelective(ApiBean record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    ApiBean selectByPrimaryKey(String apiId);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int updateByPrimaryKeySelective(ApiBean record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int updateByPrimaryKey(ApiBean record);
}