package org.toy;

import java.util.List;

public class MyFooRemover {

    public static void remove(List<String> list) {
        for (String s : list)
            if (s.contains("foo"))
                list.remove(s);
    }

}
