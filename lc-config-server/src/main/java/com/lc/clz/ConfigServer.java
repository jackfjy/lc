package com.lc.clz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //服务客户端，让该服务注册到Eureka中
@EnableDiscoveryClient //服务发现
@EnableConfigServer  //启动注册中心
public class ConfigServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServer.class).run(args);
    }


}
