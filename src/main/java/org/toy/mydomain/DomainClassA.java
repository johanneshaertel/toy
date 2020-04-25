package org.toy.mydomain;

import java.util.Collection;
import java.util.LinkedList;

public class DomainClassA {

    public DomainClassA() {
        Collection<DomainClassB> children;

        children = new LinkedList<>();
        children.add(new DomainClassB());

        for (DomainClassB x : children)
            x.execute();
    }

    public void execute() {

    }
}
