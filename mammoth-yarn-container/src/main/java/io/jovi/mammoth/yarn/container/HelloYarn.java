package io.jovi.mammoth.yarn.container;

import lombok.extern.slf4j.Slf4j;
import org.springframework.yarn.annotation.OnContainerStart;
import org.springframework.yarn.annotation.YarnComponent;

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
@Slf4j
@YarnComponent
public class HelloYarn {

    @OnContainerStart
    public void publicVoidNoArgsMethod() throws Exception {
        log.info("Hello from HelloPojo");
        log.info("#################");
        log.info("########结束");
    }
    
}
