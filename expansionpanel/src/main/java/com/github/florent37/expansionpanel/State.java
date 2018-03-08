package com.github.florent37.expansionpanel;

import java.io.Serializable;

final class State implements Serializable {

    private boolean expanded = false;

    State(boolean expanded) {
        this.expanded = expanded;
    }

    boolean isExpanded() {
        return expanded;
    }

    @Override
    public String toString() {
        return "State{" +
                "expanded=" + expanded +
                '}';
    }
}