package com.consistency.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiayang
 **/
@Component
public class RestTemplateConfig {

    // 支持http请求和通信的组件
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
