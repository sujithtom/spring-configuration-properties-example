package com.sujithtom.springconfigurationpropertiesexample.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SimpleMapTest {

    @Autowired
    SimpleMap simpleMap;

    @Test
    void getKeyValueMap() {
        assertEquals("value1", simpleMap.getKeyValueMap().get("key1"));
        assertEquals("value2", simpleMap.getKeyValueMap().get("key2"));
    }
}