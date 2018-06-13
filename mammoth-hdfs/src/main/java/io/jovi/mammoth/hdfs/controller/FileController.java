package io.jovi.mammoth.hdfs.controller;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2018
 * All rights reserved. 2018-06-05.
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@RestController
@RequestMapping("/hadoop/hdfs/")
public class FileController {
    /**
     *
     */
    @RequestMapping(value = "create",method = RequestMethod.GET)
    public String create() throws Exception {
        FileSystem fs = null;
        Configuration conf = new Configuration();
        conf.set("fs.hdfs.impl", org.apache.hadoop.hdfs.DistributedFileSystem.class.getName());
        conf.set("fs.defaultFS","hdfs://172.16.56.100:9000/");

        fs = FileSystem.get(new URI("hdfs://172.16.56.100:9000/"), conf, "hadoop");

        return null;
    }
}
