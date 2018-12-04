package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Products;
import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice{
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        Logger log = Logger.getLogger("myTest");
        ProductsDao productsDao=new ProductsDao();
        log.info(productsDao);
        log.warn(productsDao);
        log.error(productsDao);
    }

    public void log4j(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        ProductsDao productsDao=(ProductsDao)ctx.getBean("proxy");

    }
}
