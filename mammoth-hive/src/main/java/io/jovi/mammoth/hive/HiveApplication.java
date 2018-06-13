package io.jovi.mammoth.hive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2018
 * All rights reserved. 2018-06-13.
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@ComponentScan(value = {"io.jovi"})
@SpringBootApplication
public class HiveApplication {
    public static void main(String[] args) {
        SpringApplication.run(HiveApplication.class, args);
    }

}
