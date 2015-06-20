// <editor-fold defaultstate="collapsed" desc="Copyright © 2014 Burning Glass International Inc.">
/*
 *******************************************************************************
 * Proprietary and Confidential
 *
 * All rights reserved. Burning
 * Glass Technologies DISCLAIMS ANY OTHER WARRANTIES, EXPRESS OR IMPLIED,
 * INCLUDING, BUT NOT LIMITED TO, ANY IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * *****************************************************************************
 */
// </editor-fold>
package com.sample.highcharts.bean.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * *
 * Spring initializer
 */
@ComponentScan({"com.sample.highcharts.bean.main", "com.sample.highcharts.service", "com.sample.highcharts.controller", "com.sample.highcharts.bean"})
@Configuration
@EnableAutoConfiguration
@ImportResource("classpath:spring-core.xml")
public class Application extends SpringBootServletInitializer {

    /**
     * *
     * Main
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.setShowBanner(true);
        app.run(args);
    }

    /**
     * *
     * Configuration to deploy the API in servlet container like Tomcat
     *
     * @param application
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
