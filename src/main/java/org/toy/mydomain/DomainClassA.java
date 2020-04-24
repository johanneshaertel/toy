package org.toy.mydomain;

import java.util.Collection;
import java.util.LinkedList;

public class DomainClassA {

    public DomainClassA() {
        Collection<DomainClassB> children;

        children = new LinkedList<>();
        children.add(new DomainClassB());
    }
}
