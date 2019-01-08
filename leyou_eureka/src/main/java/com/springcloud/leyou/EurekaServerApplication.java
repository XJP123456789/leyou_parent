package com.springcloud.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 只有经过长时间完成其发展的艰苦工作，
 * 并长期埋头沉浸于其中的任务，方可望有所成就。
 *
 * @author Ms.xiao
 * @data 2018/12/29 -- 22:30
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
