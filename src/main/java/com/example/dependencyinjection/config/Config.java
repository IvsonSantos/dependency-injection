package com.example.dependencyinjection.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.example.dependencyinjection" })
public class Config {
}
