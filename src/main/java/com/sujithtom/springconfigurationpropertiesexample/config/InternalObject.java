package com.sujithtom.springconfigurationpropertiesexample.config;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class InternalObject {
    Map<String, String> internalMap;
}
