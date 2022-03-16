package com.sujithtom.springconfigurationpropertiesexample.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NestedMapConfigTest {

    @Autowired
    NestedMapConfig nestedMapConfig;

    @Test
    void getFirstNested() {
        assertTrue(nestedMapConfig.getFirstNested().containsKey("second-nested1"));
        assertEquals("value1-1", nestedMapConfig.getFirstNested().get("second-nested1").get("key1-1"));
        assertEquals("value1-2", nestedMapConfig.getFirstNested().get("second-nested1").get("key1-2"));
        assertEquals("value2-1", nestedMapConfig.getFirstNested().get("second-nested2").get("key2-1"));
        assertEquals("value2-2", nestedMapConfig.getFirstNested().get("second-nested2").get("key2-2"));
        assertEquals("value2-3", nestedMapConfig.getFirstNested().get("second-nested2").get("key2-3"));
    }
}