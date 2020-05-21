package com.learningJakartaEE.qualifiers.service;

import com.learningJakartaEE.qualifiers.entity.Salute;

import javax.inject.Inject;

public class Qualifiers {
    private final Salute solider;
    private final Salute policeman;

    @Inject
    public Qualifiers(@Serviceman(ServiceType.SOLIDER) Salute solider,@Serviceman(ServiceType.POLICE) Salute policeman) {
        this.solider = solider;
        this.policeman = policeman;
    }

    public void salutation(){
        solider.salute();
        policeman.salute();
    }
}
