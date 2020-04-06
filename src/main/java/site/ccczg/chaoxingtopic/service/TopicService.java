package site.ccczg.chaoxingtopic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.ccczg.chaoxingtopic.bean.Topic;
import site.ccczg.chaoxingtopic.mapper.TopicMapper;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicMapper topicMapper;


    public Long getTopicCount() {
        return topicMapper.getTopicCount();
    }

    public Topic getTopic(String keyword) {
        return topicMapper.getTopic(keyword);
    }

    public List<Topic> getTopicByKeyword(String keyword){
        return topicMapper.getTopicByKeyword(keyword);
    }

    public int insertTopic(Topic topic){
        return topicMapper.insertTopic(topic);
    }
    public int updateTopic(String question,String answer) {
        return topicMapper.updateTopic(answer,question);
    }
    public Topic getTopicByQuestion(String question) {
        return topicMapper.getTopicByQuestion(question);
    }
}
