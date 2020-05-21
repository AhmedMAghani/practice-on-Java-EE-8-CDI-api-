package com.learningJakartaEE.Produser.service;

import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import java.util.logging.Logger;

public interface ProducesInjectableBean {
    Logger getLogger(InjectionPoint injectionPoint);
}
