package org.toy;

import java.util.ArrayList;
import java.util.Arrays;

public class MyFooRemoveUser {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "foobar", "c", "d"));

        MyFooRemover.remove(list);
        
        System.out.println(list);
    }
}
