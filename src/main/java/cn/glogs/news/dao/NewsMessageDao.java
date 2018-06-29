package cn.glogs.news.dao;

import cn.glogs.news.entity.NewsMessage;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NewsMessageDao {
    @Select("select * from newsMessage where Id = #{id}")
    NewsMessage selectMessageById(@Param("id") int id);

    @Select("select * from newsMessage where 1")
    List<NewsMessage> selectAllMessages();

    @Delete("delete from newsMessage where Id = #{id} ")
    int deleteById(@Param("id") int id);

    @Update("update newsMessage set Id=#{id}, Title=#{title}, Address=#{address}, Content=#{content}")
    int updateById(NewsMessage message);

    @Insert("insert into newsMessage values(null, #{title}, #{detailType}, #{time}, #{address}, #{content})")
    int insertNews(NewsMessage message);

    @Update("update newsMessage set Title=#{title}, Content=#{content}")
    int edit(NewsMessage news);
}
