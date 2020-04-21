package org.toy.otherpackage;

import org.toy.MyFooAndBarRemover;

import java.util.Collections;

public class MyFooRemoveUser2 {

    public static void main(String[] args) {
        MyFooAndBarRemover.removeFoo(Collections.singletonList("a"));
    }
}
