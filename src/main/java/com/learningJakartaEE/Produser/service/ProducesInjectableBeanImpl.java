package com.learningJakartaEE.Produser.service;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.logging.Logger;

public class ProducesInjectableBeanImpl implements ProducesInjectableBean {

    /**
     *example one filed producer in converting Entity manager to injectable bean
     */
    @Produces
    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @param injectionPoint
     * @return
     * Transform Logger to a managed bean that the CDI can transform to a contextual instance
     * to be injected using @Inject CDI annotation, this example of the method producer used when we have
     * particular customization of the object, I.E: all parameter must be injectable by the CDI
     */
    @Override
    @Produces
    public Logger getLogger(InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getMember().getName());
    }
}
