package com.study.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class AudienceXML {
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    public void takeSeats(){
        System.out.println("Taking seats");
    }

    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }
    }

}
