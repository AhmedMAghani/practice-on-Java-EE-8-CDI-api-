package com.learningJakartaEE.Produser.boundry;

import com.learningJakartaEE.Produser.service.DishesService;
import com.learningJakartaEE.scoopes.boundry.Web;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.logging.Logger;

@Web
public class Producers {
    private final Logger logger;
    private final EntityManager entityManager;
    private final DishesService dishesService;

    @Inject
    public Producers(Logger logger, EntityManager entityManager, DishesService dishesService) {
        this.logger = logger;
        this.entityManager = entityManager;
        this.dishesService = dishesService;
    }
}
