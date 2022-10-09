package org.example.collections.model;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class Client {

    Properties properties;
    List<String> list;
    Map<String,Integer> map;
    Set<String> set;
}
