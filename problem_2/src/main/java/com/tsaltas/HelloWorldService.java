package com.tsaltas;

import com.tsaltas.hello.EchoResource;
import com.tsaltas.hello.HelloWorldResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldService extends Application<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldService().run(args);
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
    }

    @Override
    public void run(HelloWorldConfiguration configuration, Environment environment) {
        final String template = configuration.getTemplate();
        final String defaultName = configuration.getDefaultName();

        environment.jersey().register(new HelloWorldResource(template, defaultName));
        environment.jersey().register(new EchoResource());

        environment.healthChecks().register("sample-healthcheck", new TemplateHealthCheck(template));
    }

}
