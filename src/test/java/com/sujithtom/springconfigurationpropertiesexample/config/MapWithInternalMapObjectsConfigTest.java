package com.sujithtom.springconfigurationpropertiesexample.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MapWithInternalMapObjectsConfigTest {

    @Autowired
    MapWithInternalMapObjectsConfig mapWithInternalMapObjectsConfig;

    @Test
    void getMap() {
        assertTrue(mapWithInternalMapObjectsConfig.getFirstNested().containsKey("internalMapObject1"));
        assertTrue(mapWithInternalMapObjectsConfig.getFirstNested().containsKey("internalMapObject2"));
        InternalObject internalObject1 = mapWithInternalMapObjectsConfig.getFirstNested().get("internalMapObject1");
        InternalObject internalObject2 = mapWithInternalMapObjectsConfig.getFirstNested().get("internalMapObject2");
        assertEquals("value1-1", internalObject1.getInternalMap().get("key1-1"));
        assertEquals("value1-2", internalObject1.getInternalMap().get("key1-2"));
        assertEquals("value2-1", internalObject2.getInternalMap().get("key2-1"));
        assertEquals("value2-2", internalObject2.getInternalMap().get("key2-2"));
        assertEquals("value2-3", internalObject2.getInternalMap().get("key2-3"));
    }
}