package org.toy;

import java.util.List;

public class MyFooAndBarRemover {

    public static void removeFoo(List<String> list) {
        // Added single line comment.
        list.removeIf(s -> s.contains("foo"));
    }

    public static <T> void removeBar(List<T> list) {
        /*
          Added multiline comment.
         */
        list.removeIf(s -> s.toString().contains("bar"));
    }

}
