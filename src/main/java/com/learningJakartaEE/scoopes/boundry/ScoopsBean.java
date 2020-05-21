package com.learningJakartaEE.scoopes.boundry;

import com.learningJakartaEE.scoopes.repository.*;
import com.learningJakartaEE.scoopes.service.ScopeBeanService;

import javax.inject.Inject;
import java.io.Serializable;

@Web
public class ScoopsBean implements Serializable {

    private final ScopeBeanService<RequestScopeBean> requestScopeBean;
    private final ScopeBeanService<ApplicationScopeBean> applicationScopeBean;
    private final ScopeBeanService<SessionScopeBean> sessionScopeBean;
    private final ScopeBeanService<DependencyScopeBean> dependencyScopeBean;

    @Inject
    public ScoopsBean(ScopeBeanService<RequestScopeBean> requestScopeBean,
                      ScopeBeanService<ApplicationScopeBean> applicationScopeBean,
                      ScopeBeanService<SessionScopeBean> sessionScopeBean,
                      ScopeBeanService<DependencyScopeBean> dependencyScopeBean) {
        this.requestScopeBean = requestScopeBean;
        this.applicationScopeBean = applicationScopeBean;
        this.sessionScopeBean = sessionScopeBean;
        this.dependencyScopeBean = dependencyScopeBean;
    }

    public void getScopeHashCode(){
        System.out.println(requestScopeBean.getHashCode());
        System.out.println(applicationScopeBean.getHashCode());
        System.out.println(sessionScopeBean.getHashCode());
        System.out.println(dependencyScopeBean.getHashCode());
    }
}
