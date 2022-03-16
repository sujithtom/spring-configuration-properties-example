package com.sujithtom.springconfigurationpropertiesexample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties("map-of-objects")
@Data
public class MapOfObjectConfig {
    private Map<String, InternalObjRepresentation> map;

    @Data
    public static class InternalObjRepresentation {
        String property1;
        String property2;
    }
}
