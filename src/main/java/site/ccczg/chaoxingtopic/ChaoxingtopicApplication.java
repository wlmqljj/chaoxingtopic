package site.ccczg.chaoxingtopic;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("site.ccczg.chaoxingtopic.mapper.*")
public class ChaoxingtopicApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChaoxingtopicApplication.class, args);
    }
}
