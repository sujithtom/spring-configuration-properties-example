package com.sujithtom.springconfigurationpropertiesexample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("simple-config")
@Data
public class SimpleConfig {
    private String keyExample1;
    private String keyExample2;
}
