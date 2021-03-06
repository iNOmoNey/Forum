package top.theanything.forum;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhou
 * @version 1.0.0
 * @ClassName App.java
 * @Description
 * @createTime 2020年04月13日 22:02:00
 */
@SpringBootApplication(scanBasePackages = "top.theanything.forum")
@MapperScan("top.theanything.forum.dao")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
