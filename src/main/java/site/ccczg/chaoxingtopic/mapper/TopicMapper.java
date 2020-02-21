package site.ccczg.chaoxingtopic.mapper;

import org.apache.ibatis.annotations.*;
import site.ccczg.chaoxingtopic.bean.Topic;

import java.util.List;

@Mapper
public interface TopicMapper {

    @Select("SELECT COUNT(*) from t_topic")
    public Long getTopicCount();

    @Select("SELECT * from t_topic WHERE question LIKE  CONCAT('%',#{keyword},'%') LIMIT 1")
    public Topic getTopic(@Param("keyword") String keyword);

    @Select("SELECT * from t_topic WHERE question LIKE  CONCAT('%',#{keyword},'%')")
    public List<Topic> getTopicByKeyword(@Param("keyword") String keyword);

    @Insert("insert into t_topic(question,answer) values (#{question},#{answer})")
    public int insertTopic(Topic topic);
}
