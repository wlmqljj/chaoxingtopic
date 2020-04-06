package site.ccczg.chaoxingtopic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("site.ccczg.chaoxingtopic.mapper")
public class ChaoxingtopicApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(ChaoxingtopicApplication.class, args);
        }catch (Exception e) {

            e.printStackTrace();
        }
    }
}
