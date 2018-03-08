package com.github.florent37.expansionpanel;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.LinkedList;
import java.util.Queue;

final class StateHolder {

    private static Queue<String> tags = new LinkedList<>();
    @Nullable
    private static StateCollection stateCollection = null;

    @Nullable
    static StateCollection getStateCollection() {
        return StateHolder.stateCollection;
    }

    static void setStateCollection(@Nullable StateCollection stateCollection) {
        StateHolder.stateCollection = stateCollection;
    }

    static void add(@NonNull String tag) {
        tags.offer(tag);
    }

    @Nullable
    static String take() {
        return tags.poll();
    }
}
