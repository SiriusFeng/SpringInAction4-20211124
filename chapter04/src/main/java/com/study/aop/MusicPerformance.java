package com.study.aop;

public class MusicPerformance implements Performance{
    @Override
    public void perform() {
        System.out.println("Playing music");
    }
}
