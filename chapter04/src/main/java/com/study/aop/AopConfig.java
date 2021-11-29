package com.study.aop;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AopConfig {

    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    @Qualifier("audienceXML")
    public AudienceXML audienceXML(){
        return new AudienceXML();
    }

    @Bean
    public Performance performance(){
        return new MusicPerformance();
    }
}
