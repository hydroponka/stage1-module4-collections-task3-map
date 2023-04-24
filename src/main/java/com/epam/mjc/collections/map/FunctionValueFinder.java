package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (int i = 0; i < functionMap.size(); i++){
            if (functionMap.get(i).equals(requiredValue)){
                return true;
            }
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sourceList.size(); i++){
            map.put(i,5*sourceList.get(i)+2);
        }
        return map;
    }
}
