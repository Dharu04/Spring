package com.sample.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages ={"com.sample.beans","com.sample.implementation","com.sample.aspects"} )
@EnableAspectJAutoProxy
public class ProjectConfig {
}
