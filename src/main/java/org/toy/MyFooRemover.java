package org.toy;

import java.util.List;

public class MyFooRemover {

    public static void removeFoo(List<String> list) {
        list.removeIf(s -> s.contains("foo"));
    }

}
