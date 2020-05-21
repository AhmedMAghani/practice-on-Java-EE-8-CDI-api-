package com.learningJakartaEE.scoopes.service;

import com.learningJakartaEE.scoopes.repository.Hashable;

public interface ScopeBeanService<T extends Hashable> {
    String getHashCode();
}
