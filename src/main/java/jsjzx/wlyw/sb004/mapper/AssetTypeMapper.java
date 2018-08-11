package jsjzx.wlyw.sb004.mapper;


import jsjzx.wlyw.sb004.entities.AssetType;
import jsjzx.wlyw.sb004.entities.AssetTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssetTypeMapper {
    long countByExample(AssetTypeExample example);

    int deleteByExample(AssetTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssetType record);

    int insertSelective(AssetType record);

    List<AssetType> selectByExample(AssetTypeExample example);

    AssetType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssetType record, @Param("example") AssetTypeExample example);

    int updateByExample(@Param("record") AssetType record, @Param("example") AssetTypeExample example);

    int updateByPrimaryKeySelective(AssetType record);

    int updateByPrimaryKey(AssetType record);
}