package com.learningJakartaEE.scoopes.repository;

import javax.enterprise.context.ConversationScoped;
import java.io.Serializable;

/**
 * @ConversationScoped
 * same like session scope but with manual handling probably used in wizard jsf
 */
@ConversationScoped
public class ConversationScopeBean implements Serializable, Hashable {
    private static final long SERIALVERSIONUID = 215478455465524L;

    @Override
    public String getHashCode() {
        return null;
    }
}
