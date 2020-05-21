package com.learningJakartaEE.scoopes.repository;

import java.io.Serializable;

/**
 * this bean is in dependency scope which means new instance will be created,
 * only at the scope of the bean that contain a reference to this class
 */
public class DependencyScopeBean implements Serializable, Hashable {
    @Override
    public String getHashCode(){
        return Integer.toString(this.hashCode());
    }
}
