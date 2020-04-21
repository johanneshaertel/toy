package org.toy;

import java.util.List;

public class MyFooRemover {

    public static void remove(List<String> list) {
        list.removeIf(s -> s.contains("foo"));
    }

}
