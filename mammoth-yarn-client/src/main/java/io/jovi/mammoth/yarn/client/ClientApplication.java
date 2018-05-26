package io.jovi.mammoth.yarn.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.yarn.client.YarnClient;

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
@EnableAutoConfiguration
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args)
                .getBean(YarnClient.class)
                .submitApplication();
    }
}
