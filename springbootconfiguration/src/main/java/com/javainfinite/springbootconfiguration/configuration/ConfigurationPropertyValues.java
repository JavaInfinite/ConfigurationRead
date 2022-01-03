package com.javainfinite.springbootconfiguration.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
@org.springframework.boot.context.properties.ConfigurationProperties("name.website") //part of our property configured name - prefix
public class ConfigurationPropertyValues {

    private String data; // suffix of our property name
    private String information; // suffix of our property name

    public void setData(String data) {
        this.data = data;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getData() {
        return data;
    }

    public String getInformation() {
        return information;
    }
}
