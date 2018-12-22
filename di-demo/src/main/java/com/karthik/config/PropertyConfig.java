package com.karthik.config;

import com.karthik.dataSourceBeans.FakeDataSource;
import com.karthik.dataSourceBeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySources({
    @PropertySource("classpath:datasource.properties"),
    @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {
    @Value("${karthik.username}")
    String user;
    @Value("${karthik.password}")
    String password;
    @Value("${karthik.dburl}")
    String url;

    @Value("${karthik.jms.username}")
    String jmsuser;
    @Value("${karthik.jms.password}")
    String jmspassword;
    @Value("${karthik.jms.dburl}")
    String jmsurl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsuser);
        fakeJmsBroker.setPassword(jmspassword);
        fakeJmsBroker.setUrl(jmsurl);
        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
