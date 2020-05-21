package com.learningJakartaEE.scoopes.repository;

import javax.enterprise.context.RequestScoped;

/**
 * @RequestScoped mean the instance will be created when the HTTP request is sent,
 * and end when the HTTP response is sent (in other words ends after the result is shown on the Browser)
 */
@RequestScoped
public class RequestScopeBean implements Hashable{

    @Override
    public String getHashCode(){
        return Integer.toString(this.hashCode());
    }
}
