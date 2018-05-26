package io.jovi.mammoth.yarn.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2018
 * All rights reserved. 2018-05-26.
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@Configuration
@EnableAutoConfiguration
public class ContainerApplication {

    @Bean
    public HelloYarn helloPojo() {
        return new HelloYarn();
    }

    public static void main(String[] args) {
        SpringApplication.run(ContainerApplication.class, args);
    }

}
