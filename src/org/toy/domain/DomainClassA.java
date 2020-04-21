package org.toy.domain;

import java.util.Collection;
import java.util.LinkedList;

public class DomainClassA {

    public Collection<DomainClassB> children;

    public DomainClassA() {
        this.children = new LinkedList<DomainClassB>();
        this.children.add(new DomainClassB());
    }
}
