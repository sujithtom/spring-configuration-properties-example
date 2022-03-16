package com.sujithtom.springconfigurationpropertiesexample.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("list-of-objects")
@Data
public class ListOfObjects {
    private List<ListObject> list;

    @Data
    public static class ListObject {
        private String name;
        private List<SubObject> subObject;

        @Data
        public static class SubObject {
            String name;
            List<String> values;
        }
    }
}
