package jsjzx.wlyw.sb004.mapper;


import jsjzx.wlyw.sb004.entities.AssetModel;
import jsjzx.wlyw.sb004.entities.AssetModelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssetModelMapper {
    long countByExample(AssetModelExample example);

    int deleteByExample(AssetModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssetModel record);

    int insertSelective(AssetModel record);

    List<AssetModel> selectByExample(AssetModelExample example);

    AssetModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssetModel record, @Param("example") AssetModelExample example);

    int updateByExample(@Param("record") AssetModel record, @Param("example") AssetModelExample example);

    int updateByPrimaryKeySelective(AssetModel record);

    int updateByPrimaryKey(AssetModel record);
}