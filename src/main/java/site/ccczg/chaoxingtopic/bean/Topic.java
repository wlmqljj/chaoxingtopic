package site.ccczg.chaoxingtopic.bean;

/**
 * @author: Effort
 * @date: 2020-02-18 16:43
 * @description:
 */
public class Topic {
    private Long id;
    private String question;
    private String answer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}