package site.ccczg.chaoxingtopic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import site.ccczg.chaoxingtopic.bean.Topic;
import site.ccczg.chaoxingtopic.service.TopicService;

import java.util.List;

/**
 * @author: Effort
 * @date: 2020-02-18 16:52
 * @description:
 */
@Controller
public class TopicController {

    @Autowired
    private TopicService service;

    @GetMapping("/add")
    public String add() {
        return "add";
    }

    /**
     * 主页
     * @return
     */
    @GetMapping(value = {"/index","/"})
    public String index(Model model) {
        model.addAttribute("topicCount",service.getTopicCount());
        return "index";
    }

    /**
     * 关键字查询
     * @param keyword
     * @return
     */
    @GetMapping("/getTopicByKeyword")
    public String Topiclist(@RequestParam(required = true) String keyword,
                            Model model) {
        List<Topic> getTopicByKeyword = service.getTopicByKeyword(keyword);
        model.addAttribute("topiclist",getTopicByKeyword);
        return "topiclist";
    }

    /**
     * 新增
     * @return
     */
    @GetMapping(value = "/insertTopic",produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String insertTopic(String question,String answer) {
        Topic topic = new Topic();
        topic.setQuestion(question);
        topic.setAnswer(answer);
        if (service.insertTopic(topic) > 0) {
            return "新增成功";
        }else {
            return "新增失败";
        }
    }
}
