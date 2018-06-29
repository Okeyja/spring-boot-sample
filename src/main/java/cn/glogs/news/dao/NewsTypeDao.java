package cn.glogs.news.dao;

import cn.glogs.news.entity.NewsType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface NewsTypeDao {

    @Select("select * from newsType where TypeId = ${id}")
    NewsType getTypeById(@Param("id") int typeId);

}
