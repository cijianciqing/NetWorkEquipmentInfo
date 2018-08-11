package jsjzx.wlyw.sb004.mapper;


import jsjzx.wlyw.sb004.entities.AssetStatus;
import jsjzx.wlyw.sb004.entities.AssetStatusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssetStatusMapper {
    long countByExample(AssetStatusExample example);

    int deleteByExample(AssetStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssetStatus record);

    int insertSelective(AssetStatus record);

    List<AssetStatus> selectByExample(AssetStatusExample example);

    AssetStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssetStatus record, @Param("example") AssetStatusExample example);

    int updateByExample(@Param("record") AssetStatus record, @Param("example") AssetStatusExample example);

    int updateByPrimaryKeySelective(AssetStatus record);

    int updateByPrimaryKey(AssetStatus record);
}