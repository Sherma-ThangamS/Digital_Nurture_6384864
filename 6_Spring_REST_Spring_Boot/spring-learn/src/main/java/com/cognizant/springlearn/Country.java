package com.cognizant.springlearn;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private String code;
    private String name;

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringLearnApplication.class);


    public Country() {
        LOGGER.debug("Inside Country Constructor");
    }

    public void setCode(String code) {
        this.code = code;
        LOGGER.debug("Setting code: {}", code);
    }

    public void setName(String name) {
        this.name = name;
        LOGGER.debug("Setting name: {}", name);
    }

    public String getCode() {
        LOGGER.debug("Getting code");
        return code;
    }

    public String getName() {
        LOGGER.debug("Getting name");
        return name;
    }

    @Override
    public String toString() {
        return "Country{" + "code='" + code + '\'' + ", name='" + name + '\'' + '}';
    }
}
