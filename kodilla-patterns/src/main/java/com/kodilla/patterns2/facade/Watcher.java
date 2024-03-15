package com.kodilla.patterns2.facade;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Watcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(com.kodilla.patterns2.facade.Watcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.OrderFacade.processOrder(..))")
    public void logEvent() {
        LOGGER.info("Logging the event - method 'processOrder' called");
    }
}
