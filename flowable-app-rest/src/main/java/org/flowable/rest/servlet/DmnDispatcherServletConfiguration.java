package org.flowable.rest.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@ComponentScan({ "org.flowable.rest.dmn.exception", "org.flowable.rest.dmn.service.api" })
@EnableAsync
public class DmnDispatcherServletConfiguration extends BaseDispatcherServletConfiguration {

    protected final Logger log = LoggerFactory.getLogger(DmnDispatcherServletConfiguration.class);

}
