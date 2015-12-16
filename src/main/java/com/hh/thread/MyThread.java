package com.hh.thread;

/**
 * Created by Administrator on 15-12-15.
 * 继承thread可以不用重写run方法
 */
public class MyThread extends Thread {
    private String name;

    public  MyThread(String name){
         this.name = name;
    }

    @Override
    public void run() {
        System.out.println("name为:"+name+" 子线程ID:"+Thread.currentThread().getId());
    }
}
