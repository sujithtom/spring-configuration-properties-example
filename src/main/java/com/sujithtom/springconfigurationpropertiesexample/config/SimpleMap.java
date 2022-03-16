package com.sujithtom.springconfigurationpropertiesexample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties("simple-map")
@Data
public class SimpleMap {
    private Map<String, String> keyValueMap;
}
