package jsjzx.wlyw.sb004.mapper;


import jsjzx.wlyw.sb004.entities.AssetGrade;
import jsjzx.wlyw.sb004.entities.AssetGradeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssetGradeMapper {
    long countByExample(AssetGradeExample example);

    int deleteByExample(AssetGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssetGrade record);

    int insertSelective(AssetGrade record);

    List<AssetGrade> selectByExample(AssetGradeExample example);

    AssetGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssetGrade record, @Param("example") AssetGradeExample example);

    int updateByExample(@Param("record") AssetGrade record, @Param("example") AssetGradeExample example);

    int updateByPrimaryKeySelective(AssetGrade record);

    int updateByPrimaryKey(AssetGrade record);
}