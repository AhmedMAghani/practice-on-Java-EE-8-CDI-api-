package com.learningJakartaEE.Events.boundry;

import com.learningJakartaEE.Events.Entity.EventData;
import com.learningJakartaEE.interceptors.Logged;

import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.event.TransactionPhase;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EventObserver implements Serializable {
    private final Logger logger;

    @Inject
    public EventObserver(Logger logger) {
        this.logger = logger;
    }

    private void plainEvent(@Observes EventData eventData){
        logger.log(Level.INFO,"User {0} Logged in at {1}, Logged from plain event observer"
                ,new Object[]{eventData.getE_mail(),eventData.getLoginTime()});
    }

    private void conditionalEvent(@Observes(notifyObserver = Reception.IF_EXISTS,during = TransactionPhase.AFTER_COMPLETION) @Admin EventData eventData){
        logger.log(Level.INFO,"User Admin {0} logged in at {1}, Logged from conditional Observer"
                , new Object[]{eventData.getE_mail(),eventData.getLoginTime()});
    }
}
