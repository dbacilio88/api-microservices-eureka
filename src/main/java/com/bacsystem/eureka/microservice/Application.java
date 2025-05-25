package com.bacsystem.eureka.microservice;

import com.bacsystem.lib.base.ApplicationBase;
import com.bacsystem.lib.properties.MicroserviceProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>Application</b>
 * <p>
 * This class specifies the requirements for the {@link Application} component,
 * developed in accordance with the development standards established by christian.
 * Collaboration is encouraged for the enhancement and expansion of the api-microservices-authentication.
 * </p>
 * <p>
 * <b>Description:</b>
 * </p>Here!</p>
 *
 * @author christian
 * @author dbacilio88@outlook.es
 * @since 24/05/2025
 */

@EnableEurekaServer
@EnableDiscoveryClient
@SpringBootApplication(
        scanBasePackages = {
                "com.bacsystem.lib",
                "com.bacsystem.eureka.microservice"
        }
)
public class Application extends ApplicationBase {

    public Application(MicroserviceProperties microserviceProperties) {
        super(microserviceProperties);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
