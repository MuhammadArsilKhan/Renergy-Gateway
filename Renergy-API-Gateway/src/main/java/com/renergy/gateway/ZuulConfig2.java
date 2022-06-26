package com.renergy.gateway;

import org.springframework.beans.BeansException;
import org.springframework.cloud.netflix.zuul.web.ZuulHandlerMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfig2 implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (applicationContext.containsBean("zuulHandlerMapping")) {
            applicationContext.getBean(ZuulHandlerMapping.class).setErrorController(null);
        }
    }
}
