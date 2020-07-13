package com.javalive.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
@Component
public class BeanA {
	private BeanB beanB;
    private BeanC beanC;
     
    public BeanA(){
        System.out.println("Creating bean BeanA");
    }
 
    @Autowired
    public void setBeanB(BeanB beanB) {
        System.out.println("Setting bean reference for BeanB");
        this.beanB = beanB;
    }
 
    @Autowired
    public void setBeanC(BeanC beanC) {
        System.out.println("Setting bean reference for BeanC");
        this.beanC = beanC;
    }
}
