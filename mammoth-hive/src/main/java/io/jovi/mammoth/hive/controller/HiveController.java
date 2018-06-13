package io.jovi.mammoth.hive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
@RestController
@RequestMapping("/hive")
public class HiveController {
    @Autowired
    @Qualifier("hiveJdbcTemplate")
    private JdbcTemplate hiveJdbcTemplate;

    @RequestMapping("/insert")
    public String insert() {
        hiveJdbcTemplate.execute("insert into user values(1,'Chen')");
        return "Done";
    }

    @RequestMapping("/select")
    public List select() {
        List rows = hiveJdbcTemplate.queryForList("SELECT * FROM USER");
        return rows;
    }
}
