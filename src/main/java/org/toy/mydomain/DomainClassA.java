package org.toy.mydomain;

import java.util.Collection;
import java.util.LinkedList;

public class DomainClassA {

    public Collection<DomainClassB> children;

    public DomainClassA() {
        this.children = new LinkedList<>();
        this.children.add(new DomainClassB());
    }
}
