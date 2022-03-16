package com.sujithtom.springconfigurationpropertiesexample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

@ConfigurationProperties("test-config")
@Data
public class MapWithInternalMapObjectsConfig {
    private Map<String, InternalObject> firstNested;

    public void setFirstNested(Map<String, Map<String, String>> input) { // You can also generify the parameters to Map<String, ?> input
        firstNested = new HashMap<>();
        input.keySet().forEach(key -> this.firstNested.put(key, new InternalObject(input.get(key))));
    }
}
