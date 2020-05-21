package com.learningJakartaEE.scoopes.repository;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *@SessionScoped mean the contextual instance of this bean will be kept a life
 * as long as the session is opened for this specific user
 */
@SessionScoped
public class SessionScopeBean implements Serializable, Hashable {
    private static final Long SERIALVERSIONUID = 440804699990999L;

    @Override
    public String getHashCode(){
        return Integer.toString(this.hashCode());
    }
}
