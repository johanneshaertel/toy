package org.toy;

import com.google.common.collect.HashMultiset;

public class CheGuava {

    public static void main(String[] args) {
        HashMultiset<String> x = HashMultiset.create();
        x.add("String");
    }
}
