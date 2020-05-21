package com.learningJakartaEE.scoopes.service;

import com.learningJakartaEE.scoopes.repository.*;

import javax.inject.Inject;

public class ScopeBeanServiceImpl<T extends Hashable> implements ScopeBeanService<T> {

    private final T hashable;

    @Inject
    public ScopeBeanServiceImpl(T hashable) {
        this.hashable = hashable;
    }

    @Override
    public String getHashCode() {
        return hashable.getHashCode();
    }
}
