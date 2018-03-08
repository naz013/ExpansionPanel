package com.github.florent37.expansionpanel;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

final class StateCollection implements Serializable {

    private Map<String, State> stateMap = new HashMap<>();

    Map<String, State> getStateMap() {
        return stateMap;
    }

    @Override
    public String toString() {
        return "StateCollection{" +
                "stateMap=" + stateMap +
                '}';
    }
}
