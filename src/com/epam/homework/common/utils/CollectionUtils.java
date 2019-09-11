package com.epam.homework.common.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class CollectionUtils {
    private CollectionUtils() {

    }

    public static <T> List<T> mutableListOf(T... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

}
