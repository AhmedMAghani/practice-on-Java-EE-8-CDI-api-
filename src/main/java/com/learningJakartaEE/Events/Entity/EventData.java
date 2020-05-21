package com.learningJakartaEE.Events.Entity;

import com.learningJakartaEE.scoopes.boundry.Web;

import java.time.LocalDateTime;

public class EventData {
    private String e_mail;
    private LocalDateTime loginTime;

    public EventData(){

    }

    public EventData(String e_mail, LocalDateTime loginTime) {
        this.e_mail = e_mail;
        this.loginTime = loginTime;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }
}
