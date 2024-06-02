package com.example.dropwizardapp;

import com.example.FlywayBundle;
import com.example.HelloWorldConfiguration;
import com.example.resource.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // Initialization logic if needed
    }

    @Override
    public void run(HelloWorldConfiguration configuration, Environment environment) {
        // Application logic
        final HelloWorldResource resource = new HelloWorldResource();
        environment.jersey().register(resource);
        environment.lifecycle().manage(new FlywayBundle(configuration.getDataSourceFactory()));
    }
}
