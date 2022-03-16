package com.sujithtom.springconfigurationpropertiesexample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties("nested-map")
@Data
public class NestedMapConfig {
    private Map<String, Map<String, String>> firstNested;
}
