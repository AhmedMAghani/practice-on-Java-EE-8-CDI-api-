package com.learningJakartaEE.qualifiers.entity;

import com.learningJakartaEE.qualifiers.service.ServiceType;
import com.learningJakartaEE.qualifiers.service.Serviceman;

import java.io.Serializable;

@Serviceman(ServiceType.SOLIDER)
public class Solider implements Serializable,Salute {

    @Override
    public void salute() {
        System.out.println("yes captain");
    }
}
