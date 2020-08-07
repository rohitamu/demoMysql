package com.demo.omlc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "query")
@PropertySource("classpath:queries.yml")
public class DemoConfig {

    @Value("${omlc}")
    private String omlc;

    public String getOmlc() {
        return omlc;
    }
}
