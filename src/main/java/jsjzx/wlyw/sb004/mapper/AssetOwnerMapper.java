package jsjzx.wlyw.sb004.mapper;


import jsjzx.wlyw.sb004.entities.AssetOwner;
import jsjzx.wlyw.sb004.entities.AssetOwnerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssetOwnerMapper {
    long countByExample(AssetOwnerExample example);

    int deleteByExample(AssetOwnerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssetOwner record);

    int insertSelective(AssetOwner record);

    List<AssetOwner> selectByExample(AssetOwnerExample example);

    AssetOwner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssetOwner record, @Param("example") AssetOwnerExample example);

    int updateByExample(@Param("record") AssetOwner record, @Param("example") AssetOwnerExample example);

    int updateByPrimaryKeySelective(AssetOwner record);

    int updateByPrimaryKey(AssetOwner record);
}