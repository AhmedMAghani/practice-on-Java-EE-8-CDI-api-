package com.learningJakartaEE.Events.boundry;

import javax.annotation.Priority;
import javax.enterprise.event.Observes;

import javax.inject.Inject;
import javax.interceptor.Interceptor;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PeriorityEventObserver {

    private Logger logger;

    @Inject
    public PeriorityEventObserver(Logger logger) {
        this.logger = logger;
    }

    private void periorityObserver1(@Observes @Priority(Interceptor.Priority.APPLICATION + 100) String s){
        logger.log(Level.INFO,"Hello");
    }

    private void periorityObserver2(@Observes @Priority(Interceptor.Priority.APPLICATION) String s){
        logger.log(Level.INFO,"World!!");
    }
}
