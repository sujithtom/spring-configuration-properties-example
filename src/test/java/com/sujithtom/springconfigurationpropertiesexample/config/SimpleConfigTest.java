package com.sujithtom.springconfigurationpropertiesexample.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class SimpleConfigTest {

    @Autowired
    SimpleConfig config;

    @Test
    void getKeyExample1() {
        assertEquals("ValueExample1", config.getKeyExample1());
    }

    @Test
    void getKeyExample2() {
        assertEquals("ValueExample2", config.getKeyExample2());
    }
}