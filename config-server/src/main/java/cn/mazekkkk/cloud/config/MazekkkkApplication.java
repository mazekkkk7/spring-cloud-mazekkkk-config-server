package cn.mazekkkk.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.ConfigServerApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 启动类
 *
 * @author maze
 * @createTime 18/10/12
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigServer
public class MazekkkkApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
