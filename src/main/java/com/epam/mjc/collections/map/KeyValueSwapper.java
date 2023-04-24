package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> entrySet: sourceMap.entrySet()) {
            map.put(entrySet.getValue(),entrySet.getKey());
        }
        return map;
    }
}
