package com.sujithtom.springconfigurationpropertiesexample.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MapOfObjectConfigTest {

    @Autowired
    MapOfObjectConfig mapOfObjectConfig;

    @Test
    void getMapTest() {
        assertTrue(mapOfObjectConfig.getMap().containsKey("internalObject1"));
        assertTrue(mapOfObjectConfig.getMap().containsKey("internalObject2"));
        assertEquals("value1-1", mapOfObjectConfig.getMap().get("internalObject1").getProperty1());
        assertEquals("value1-2", mapOfObjectConfig.getMap().get("internalObject1").getProperty2());

        assertEquals("value2-1", mapOfObjectConfig.getMap().get("internalObject2").getProperty1());
        assertEquals("value2-2", mapOfObjectConfig.getMap().get("internalObject2").getProperty2());
    }
}