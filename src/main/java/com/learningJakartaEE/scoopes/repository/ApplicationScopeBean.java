package com.learningJakartaEE.scoopes.repository;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;

/**
 * @ApplicationScoped mean on contextual instance will be created through the life time of the application
 */
@ApplicationScoped
public class ApplicationScopeBean implements Serializable, Hashable {
    private static final Long SERIALVERSIONUID = 27080464521478L;

    @Override
    public String getHashCode(){
        return Integer.toString(this.hashCode());
    }
}
