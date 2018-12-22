package com.karthik;

import com.karthik.controllers.ConstructorInjectedController;
import com.karthik.controllers.MyController;
import com.karthik.controllers.PropertyInjectedController;
import com.karthik.controllers.SetterInjectedController;
import com.karthik.dataSourceBeans.FakeDataSource;
import com.karthik.dataSourceBeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource  = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

        System.out.println(fakeDataSource.getUser());

        System.out.println(fakeJmsBroker.getUser());

       /* myController.hello();
        System.out.println(myController.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());*/
    }

}

