package com.apptanium.apps.mailserver;

import com.apptanium.apps.mailserver.repositories.SystemService;
import com.apptanium.apps.mailserver.repositories.UserService;
import com.apptanium.apps.mailserver.security.SecurityBootstrapListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudException;
import org.springframework.cloud.CloudFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class MailServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailServerApplication.class, args);
    }

    //	Access Cloud-specific information in a cloud-neutral way:
    @Bean
    public Cloud cloudFactory() {

        try {
            return new CloudFactory().getCloud();
        } catch ( CloudException ce ) {
            //	Not running in cloud environment, return null
            return null;
        }
    }

    @Bean
    public UserService getUserService() {
        return new UserService();
    }

    @Bean
    public SystemService getSystemService() {
        return new SystemService();
    }

    @Bean
    public SecurityBootstrapListener getSecurityBootstrapListener() {
        return new SecurityBootstrapListener();
    }

/*
    @Bean
    public DynamicRepositoryFactoryBean getDynamicRepositoryFactoryBean() {
        System.out.println("********>>>>>>> getting dynamic repo");
        return new DynamicRepositoryFactoryBean();
    }
*/
}
