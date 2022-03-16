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
        assertTrue(nestedMapConfig.getFirstNested().containsKey("second-nested"));
        assertEquals("value1", nestedMapConfig.getFirstNested().get("second-nested").get("key1"));
        assertEquals("value2", nestedMapConfig.getFirstNested().get("second-nested").get("key2"));
    }
}