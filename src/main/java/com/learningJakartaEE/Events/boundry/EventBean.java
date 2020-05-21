package com.learningJakartaEE.Events.boundry;

import com.learningJakartaEE.Events.Entity.EventData;
import com.learningJakartaEE.Events.Entity.User;
import com.learningJakartaEE.scoopes.boundry.Web;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.concurrent.CompletionStage;

@Web
public class EventBean {

    private final User user;
    private final Event<EventData> plainEvent;
    @Admin
    private final Event<EventData> conditionalEvent;
    private final Event<String> periorityEvent;

    @Inject
    public EventBean(User user, Event<EventData> plainEvent, Event<EventData> conditionalEvent, Event<String> periorityEvent) {
        this.user = user;
        this.plainEvent = plainEvent;
        this.conditionalEvent = conditionalEvent;
        this.periorityEvent = periorityEvent;
    }

    public void login(){
        plainEvent.fire(new EventData(user.getE_mail(), LocalDateTime.now()));
        CompletionStage<EventData> completionStage = plainEvent.fireAsync(new EventData(user.getE_mail(),LocalDateTime.now()));
        conditionalEvent.fire(new EventData(user.getE_mail(),LocalDateTime.now()));
        periorityEvent.fire("hello from periority event");

    }
}
