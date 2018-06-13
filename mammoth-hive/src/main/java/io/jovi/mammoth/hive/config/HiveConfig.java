package io.jovi.mammoth.hive.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import org.apache.tomcat.jdbc.pool.DataSource;

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
@Slf4j
@Configuration
public class HiveConfig {


    @Autowired
    private Environment env;

    @Bean(name = "hiveJdbcDataSource")
    @Qualifier("hiveJdbcDataSource")
    public DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setUrl(env.getProperty("hive.url"));
        dataSource.setDriverClassName(env.getProperty("hive.driver-class-name"));
        dataSource.setUsername(env.getProperty("hive.username"));
        dataSource.setPassword(env.getProperty("hive.password"));
        log.debug("Hive DataSource");
        return dataSource;
    }

    @Bean(name = "hiveJdbcTemplate")
    public JdbcTemplate hiveJdbcTemplate(@Qualifier("hiveJdbcDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
