package org.toy.otherpackage;

import org.toy.MyFooRemover;

import java.util.Collections;

public class MyFooRemoveUser2 {

    public static void main(String[] args) {
        MyFooRemover.remove(Collections.singletonList("a"));
    }
}
