package com.sujithtom.springconfigurationpropertiesexample.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ListOfObjectsTest {

    @Autowired
    ListOfObjects listOfObjects;

    @Test
    void getList() {
        assertTrue(listOfObjects.getList().stream().anyMatch(listItem -> listItem.getName().equals("list-1")));
        assertTrue(listOfObjects.getList().stream().anyMatch(listItem -> listItem.getName().equals("list-2")));

        Optional<ListOfObjects.ListObject> list1 = listOfObjects.getList().stream().filter(listObject -> listObject.getName().equals("list-1")).findFirst();
        assertTrue(list1.get().getSubObject().stream().anyMatch(subObject -> subObject.getName().equals("subObject-1")));
        assertTrue(list1.get().getSubObject().stream().anyMatch(subObject -> subObject.getName().equals("subObject-2")));

        Optional<ListOfObjects.ListObject.SubObject> subObject1 = list1.get().getSubObject().stream().filter(subObject -> subObject.getName().equals("subObject-1")).findFirst();
        assertTrue(subObject1.get().getValues().containsAll(Arrays.asList("sublist1-1-1", "sublist1-1-2")));

    }
}