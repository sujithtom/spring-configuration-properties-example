package com.sujithtom.springconfigurationpropertiesexample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("simple")
@Data
public class SimpleConfig {
    String keyExample1;
    String keyExample2;
}
