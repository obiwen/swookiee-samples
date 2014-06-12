package com.swookiee.demo.configuration;

import com.swookiee.runtime.authentication.AdminUserConfiguration;
import com.swookiee.runtime.metrics.configuration.GraphiteReporterConfiguration;

/*
 * This is a simple POJO which will be filled from the Configuration.yaml from src/main/resources
 */
public class Configuration {

    /**
     * We want to read Graphite Configuration from the Configuration.yaml
     */
    public GraphiteReporterConfiguration graphiteReporterConfiguration;

    /**
     * We also want to change the default username and pasword for the felix
     * console and the remote API
     */
    public AdminUserConfiguration adminUserConfiguration;

}
