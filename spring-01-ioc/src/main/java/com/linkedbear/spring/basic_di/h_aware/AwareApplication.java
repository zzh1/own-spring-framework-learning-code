package com.linkedbear.spring.basic_di.h_aware;

import com.linkedbear.spring.basic_di.h_aware.bean.AwaredTestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareApplication {

    public static void main(String[] args) throws  Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AwaredTestBean.class);
        AwaredTestBean bbb = ctx.getBean(AwaredTestBean.class);
        bbb.printBeanNames();

    }

}
