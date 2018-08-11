package jsjzx.wlyw.sb004.mapper;


import jsjzx.wlyw.sb004.entities.Asset;
import jsjzx.wlyw.sb004.entities.AssetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssetMapper {
    long countByExample(AssetExample example);

    int deleteByExample(AssetExample example);

    int deleteByPrimaryKey(Integer hostid);

    int insert(Asset record);

    int insertSelective(Asset record);

    List<Asset> selectByExample(AssetExample example);

    Asset selectByPrimaryKey(Integer hostid);

    int updateByExampleSelective(@Param("record") Asset record, @Param("example") AssetExample example);

    int updateByExample(@Param("record") Asset record, @Param("example") AssetExample example);

    int updateByPrimaryKeySelective(Asset record);

    int updateByPrimaryKey(Asset record);
}